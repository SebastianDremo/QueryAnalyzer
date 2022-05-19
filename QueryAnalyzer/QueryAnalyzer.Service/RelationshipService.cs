using System.ComponentModel.DataAnnotations.Schema;
using QueryAnalyzer.Repository;

namespace QueryAnalyzer.Service;

using System.Collections.Generic;
using QueryAnalyzer.Domain;

public class RelationshipService
{
    
    public List<Relationship> BuildRelationshipsFromQuery(Query query, UserRepository repository, UserRepository database)
    {
        List<Relationship> relationships = new List<Relationship>();

        foreach(var join in query.Joins)
        {
            relationships.AddRange(BuildRelationshipFromJoin(join, repository, database));
        }

        return relationships;
    }

    //TODO SK: Refactor this code not to have all tests in this giant method
    private List<Relationship> BuildRelationshipFromJoin(Join join, UserRepository repository, UserRepository database)
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

            if (!CheckIfFKValuesPresentInPK(relationship, database))
            {
                continue;
            }
            
            relationships.Add(relationship);
        }

        return relationships;
    }

    public bool CheckIfFKValuesPresentInPK(Relationship relationship, UserRepository repository)
    {
        return CheckIfFKValuesPresentInPK(
                    relationship.PKSchema,
                    relationship.FKSchema,
                    relationship.PKTable,
                    relationship.FKTable,
                    relationship.PKColumn,
                    relationship.FKColumn,
                    repository);
    }
    
    public bool CheckIfFKValuesPresentInPK(
        string pkSchema,
        string fkSchema,
        string pkTable,
        string fkTable,
        string pkColumn,
        string fkColumn,
        UserRepository repository)
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
        
        return !repository.SendScalarQuery(query);
    }
}
