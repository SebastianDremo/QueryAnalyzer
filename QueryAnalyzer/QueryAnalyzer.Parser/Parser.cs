using QueryAnalyzer.Parser.Interfaces;

namespace QueryAnalyzer.Parser;

public class Parser
{
    private readonly IListener _listener;
    
    public Parser(IListener listener)
    {
        _listener = listener;

        _listener.RelationFound = OnRelationFound;
    }

    private void OnRelationFound()
    {
        
    }
}