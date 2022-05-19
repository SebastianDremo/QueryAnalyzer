using QueryAnalyzer.Domain;

namespace QueryAnalyzer.Parser.Interfaces;

public interface IListener
{
    Action<Query> QueryFound { get; set; }
    Action<string?, string?, string?> ColumnForIndexFound { get; set; }
}