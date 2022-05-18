namespace QueryAnalyzer.Domain;

using System.Collections.Generic;

public class Relationship
{
    public Relationship()
    {
    }

    public string PKSchema { get; set; }
    
    public string FKSchema { get; set; }
    
    public string PKTable { get; set; }

    public string FKTable { get; set; }

    public List<string> PKColumns { get; set; }

    public List<string> FKColumns { get; set; }
    
    
}

