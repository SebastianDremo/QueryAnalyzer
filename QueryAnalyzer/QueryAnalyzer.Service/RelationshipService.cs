using System.ComponentModel.DataAnnotations.Schema;
using QueryAnalyzer.Repository;

namespace QueryAnalyzer.Service;

using System.Collections.Generic;
using QueryAnalyzer.Domain;

public class RelationshipService
{
    
    public List<Relationship> BuildRelationshipsFromQuery(Query query, UserRepository repository)
    {
        List<Relationship> relationships = new List<Relationship>();

        foreach(var join in query.Joins)
        {
            relationships.AddRange(BuildRelationshipFromJoin(join, repository));
        }

        return relationships;
    }

    private List<Relationship> BuildRelationshipFromJoin(Join join, UserRepository repository)
    {
        List<Relationship> relationships = new List<Relationship>();
        
        string joinedTable = join.JoinedTableName;
        string joinedSchema = join.JoinedTableSchema;

        bool isLeftTablePK = false;
        bool isRightTablePK = false;

        var uniqueKeyService = new UniqueKeyService();
        foreach(JoinClause joinClause in join.JoinClauses)
        {
            string pkTable = null;
            string fkTable = null;
            string pkSchema = null;
            string fkSchema = null;
            List<string> pkColumns = new List<string>();
            List<string> fkColumns = new List<string>();

            if (uniqueKeyService.CheckIfPKExists(
                    joinClause.LeftPart.TableSchema,
                    joinClause.LeftPart.TableName,
                    joinClause.LeftPart.Column,
                    repository))
            {
                isLeftTablePK = true;
                pkColumns.Add(joinClause.LeftPart.Column);
                fkColumns.Add(joinClause.RightPart.Column);
            }
            if (uniqueKeyService.CheckIfPKExists(
                    joinClause.RightPart.TableSchema,
                    joinClause.RightPart.TableName,
                    joinClause.RightPart.Column,
                    repository))
            {
                isRightTablePK = true;
                pkColumns.Add(joinClause.RightPart.Column);
                fkColumns.Add(joinClause.LeftPart.Column);
            }

            if (isLeftTablePK)
            {
                pkSchema = joinClause.LeftPart.TableSchema;
                fkSchema = joinClause.RightPart.TableSchema;
                pkTable = joinClause.LeftPart.TableName;
                fkTable = joinClause.RightPart.TableName;
            }
            else if (isRightTablePK)
            {
                pkSchema = joinClause.RightPart.TableSchema;
                fkSchema = joinClause.LeftPart.TableSchema;
                pkTable = joinClause.RightPart.TableName;
                fkTable = joinClause.LeftPart.TableName;
            }
            else
            {
                continue;
            }
            
            
            relationships.Add(new Relationship()
            {
                PKSchema = pkSchema,
                FKSchema = fkSchema,
                PKTable = pkTable,
                FKTable = fkTable,
                PKColumns = pkColumns,
                FKColumns = fkColumns
            });
        }

        return relationships;
    }
}
