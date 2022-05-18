using QueryAnalyzer.Parser.Interfaces;

namespace QueryAnalyzer.Parser;

public class SqlListener : SqlParserBaseListener, IListener
{
    public Action RelationFound { get; set; }
}