namespace QueryAnalyzer.Domain;

public class JoinPart
{
    public string TableName { get; set; }
    
    public string TableSchema { get; set; }

    public string Column { get; set; }
}