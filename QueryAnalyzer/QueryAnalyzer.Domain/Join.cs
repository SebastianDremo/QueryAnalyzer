namespace QueryAnalyzer.Domain;

public class Join
{
    public string JoinedTableName { get; set; }

    public string JoinedTableSchema { get; set; }

    public List<JoinClause> JoinClauses { get; set; }
}