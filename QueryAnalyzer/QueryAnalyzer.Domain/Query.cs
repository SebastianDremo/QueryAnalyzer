namespace QueryAnalyzer.Domain;

public class Query
{
    public string FromTableName { get; set; }

    public string FromTableSchema { get; set; }

    public List<Join> Joins { get; set; }

    public Query()
    {
        Joins = new List<Join>();
    }
}