using System.ComponentModel.DataAnnotations.Schema;
using QueryAnalyzer.Repository;

namespace QueryAnalyzer.Service;

using System.Collections.Generic;
using QueryAnalyzer.Domain;

public class RelationshipService
{
    
    public List<Relationship> BuildRelationshipsFromQuery(Query query, UserRepository database, UserRepository repository)
    {
        List<Relationship> relationships = new List<Relationship>();

        foreach(var join in query.Joins)
        {
            relationships.AddRange(BuildRelationshipFromJoin(join, database, repository));
        }

        return relationships;
    }

    //TODO SK: Refactor this code not to have all tests in this giant method
    private List<Relationship> BuildRelationshipFromJoin(Join join, UserRepository database, UserRepository repository)
    {
        List<Relationship> relationships = new List<Relationship>();
        
        string joinedTable = join.JoinedTableName;
        string joinedSchema = join.JoinedTableSchema;

        bool isLeftTablePK = false;
        bool isRightTablePK = false;

        var uniqueKeyService = new PrimaryKeyService();
        foreach(JoinClause joinClause in join.JoinClauses)
        {
            string pkTable = null;
            string fkTable = null;
            string pkSchema = null;
            string fkSchema = null;
            string pkColumn = null;
            string fkColumn = null;

            if (uniqueKeyService.CheckIfPKExists(
                    joinClause.LeftPart.TableSchema,
                    joinClause.LeftPart.TableName,
                    joinClause.LeftPart.Column,
                    repository))
            {
                isLeftTablePK = true;
                pkColumn = joinClause.LeftPart.Column;
                fkColumn = joinClause.RightPart.Column;
            }
            if (uniqueKeyService.CheckIfPKExists(
                    joinClause.RightPart.TableSchema,
                    joinClause.RightPart.TableName,
                    joinClause.RightPart.Column,
                    repository))
            {
                isRightTablePK = true;
                pkColumn = joinClause.RightPart.Column;
                fkColumn = joinClause.LeftPart.Column;
            }
            
            if(isLeftTablePK == isRightTablePK)
            {
                continue;
            }
            if (isLeftTablePK)
            {
                pkSchema = joinClause.LeftPart.TableSchema;
                fkSchema = joinClause.RightPart.TableSchema;
                pkTable = joinClause.LeftPart.TableName;
                fkTable = joinClause.RightPart.TableName;
            }
            if (isRightTablePK)
            {
                pkSchema = joinClause.RightPart.TableSchema;
                fkSchema = joinClause.LeftPart.TableSchema;
                pkTable = joinClause.RightPart.TableName;
                fkTable = joinClause.LeftPart.TableName;
            }

            var relationship = new Relationship()
            {
                PKSchema = pkSchema,
                FKSchema = fkSchema,
                PKTable = pkTable,
                FKTable = fkTable,
                PKColumn = pkColumn,
                FKColumn = fkColumn
            };

            if (CheckIfFKValuesPresentInPK(relationship, database)
                && (CheckIfRelationshipExists(relationship, repository)))
            {
                relationships.Add(relationship);
            }
            
            
        }

        return relationships;
    }

    public bool CheckIfFKValuesPresentInPK(Relationship relationship, UserRepository database)
    {
        return CheckIfFKValuesPresentInPK(
                    relationship.PKSchema,
                    relationship.FKSchema,
                    relationship.PKTable,
                    relationship.FKTable,
                    relationship.PKColumn,
                    relationship.FKColumn,
                    database);
    }
    
    public bool CheckIfFKValuesPresentInPK(
        string pkSchema,
        string fkSchema,
        string pkTable,
        string fkTable,
        string pkColumn,
        string fkColumn,
        UserRepository database)
    {
        pkSchema = string.IsNullOrEmpty(pkSchema) ? pkSchema : pkSchema + ".";
        fkSchema = string.IsNullOrEmpty(fkSchema) ? fkSchema : fkSchema + ".";

        var query = $@"SELECT 
	                        1 AS [1]
                        FROM 
	                        {fkSchema}{fkTable}
                        LEFT JOIN {pkSchema}{pkTable} ON
	                        {fkTable}.{fkColumn} = {pkTable}.{pkColumn}
                        WHERE
	                        {pkTable}.{pkColumn} IS NULL";
        
        // if any value is returned by query (true) then there is a FK value
        // which is not present in PK hence returning negation
        
        return !database.SendScalarQuery(query);
    }

    public List<Relationship> GetFKForPKColumns(UserRepository repository, UserRepository database)
    {
        List<Relationship> relationships = new List<Relationship>();
        var query = $@"SELECT 
	                        uc_tab.[schema] AS PKSchema,
	                        uc_tab.[name] AS PKTable,
	                        uc_col.[name] AS PKColumn,
	                        fk_tab.[schema] AS FKSchema,
	                        fk_tab.[name] AS FKTable,
	                        fk_col.[name] AS FKColumn
                        FROM
	                        [unique_constraints] uc
                        INNER JOIN [tables] uc_tab ON
	                        uc.[table_id] = uc_tab.[table_id]
                        INNER JOIN [unique_constraints_columns] ucc ON
	                        uc.[unique_constraint_id] = ucc.[unique_constraint_id]
                        INNER JOIN [columns] uc_col ON
	                        ucc.[column_id] = uc_col.[column_id]
                        LEFT JOIN [columns] fk_col ON
	                        fk_col.[name] = uc_col.[name]
	                        OR fk_col.[name] = uc_tab.[name]
                        LEFT JOIN [tables] fk_tab ON
	                        fk_col.[table_id] = fk_tab.[table_id]
	                        AND uc_tab.[database_id] = fk_tab.[database_id]
                        WHERE 
	                        uc.[primary_key] = 1
	                        AND 
	                        (
		                        uc_tab.[schema] != fk_tab.[schema]
		                        OR
		                        (uc_tab.[schema] = fk_tab.[schema] AND uc_tab.[name] != fk_tab.[name])
	                        )
	                        AND uc_tab.[object_type] = 'TABLE'
	                        AND fk_tab.[object_type] = 'TABLE';";
        
        using (var reader = repository.SendQuery(query))
        {
            if (reader == null)
            {
                return relationships;
            }
            while (reader.Read())
            {
                var relationship = new Relationship()
                {
                    FKSchema = reader.GetString(reader.GetOrdinal("FKSchema")),
                    FKTable = reader.GetString(reader.GetOrdinal("FKTable")),
                    FKColumn = reader.GetString(reader.GetOrdinal("FKColumn")),
                    PKSchema = reader.GetString(reader.GetOrdinal("PKSchema")),
                    PKTable = reader.GetString(reader.GetOrdinal("PKTable")),
                    PKColumn = reader.GetString(reader.GetOrdinal("PKColumn"))
                };
                if (CheckIfFKValuesPresentInPK(relationship, database)
                    && !CheckIfRelationshipExists(relationship, repository))
                {
                    relationships.Add(relationship);
                }
            }
            
        }

        return relationships;
    }

    public bool CheckIfRelationshipExists(Relationship relationship, UserRepository repository)
    {
        var query = $@"SELECT 
	                        1 AS [1]
                        FROM
	                        [tables_relations] tr
                        JOIN [tables_relations_columns] trc ON
	                        tr.[table_relation_id] = trc.[table_relation_id]
                        JOIN [tables] pk_tab ON
	                        tr.[pk_table_id] = pk_tab.[table_id]
                        JOIN [tables] fk_tab ON
	                        tr.[fk_table_id] = fk_tab.[table_id]
                        JOIN [columns] pk_c ON
	                        trc.[column_pk_id] = pk_c.[column_id]
                        JOIN [columns] fk_c ON
	                        trc.[column_fk_id] = fk_c.[column_id]
                        WHERE
	                        pk_tab.[schema]     = '{relationship.PKSchema}' 
	                        AND pk_tab.[name]   = '{relationship.PKTable}'
	                        AND pk_c.[name]     = '{relationship.PKColumn}'
	                        AND fk_tab.[schema] = '{relationship.FKSchema}' 
	                        AND fk_tab.[name]   = '{relationship.FKTable}' 
	                        AND fk_c.[name]     = '{relationship.FKColumn}' ";

        return repository.SendScalarQuery(query);
    }
}
