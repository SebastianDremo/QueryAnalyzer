namespace QueryAnalyzer.Parser.Interfaces;

public interface IListener
{
    Action RelationFound { get; set; }
}