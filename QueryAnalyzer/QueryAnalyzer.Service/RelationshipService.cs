namespace QueryAnalyzer.Service;

using System.Collections.Generic;
using QueryAnalyzer.Domain;

public class RelationshipService
{
    
    public List<Relationship> BuildRelationshipsFromQuery(Query query)
    {
        List<Relationship> relationships = new List<Relationship>();

        foreach(var join in query.Joins)
        {
            relationships.Add(BuildRelationshipFromJoin(query.FromTable, join));
        }
    }

    private Relationship BuildRelationshipFromJoin(string fromTable, Join join)
    {
        string pkTable = fromTable;
        string fkTable = join.JoinedTable;
        List<string> pkColumns = new List<string>();
        List<string> fkColumns = new List<string>();

        foreach(JoinClause joinClause in join.JoinClauses)
        {
            if(joinClause.LeftPart.Table.Equals(pkTable))
            {
                pkColumns.Add(joinClause.LeftPart.Column);
                fkColumns.Add(joinClause.RightPart.Column);
            }
            else
            {
                pkColumns.Add(joinClause.RightPart.Column);
                fkColumns.Add(joinClause.LeftPart.Column);
            }
        }

        return new Relationship()
        {
            PKTable = pkTable,
            FKTable = fkTable,
            PKColumns = pkColumns,
            FKColumns = fkColumns
        };
    }
}
