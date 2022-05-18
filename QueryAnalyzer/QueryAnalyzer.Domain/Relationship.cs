namespace QueryAnalyzer.Domain;

using System.Collections.Generic;

class Relationship
{
    public string PKTable { get; set; }

    public string FKTable { get; set; }

    public List<string> PKColumns { get; set; }

    public List<string> FKColumns { get; set; }
}

