using QueryAnalyzer.Domain;
using QueryAnalyzer.Parser.Interfaces;

namespace QueryAnalyzer.Parser;

public class Parser
{
    private readonly IListener _listener;
    private readonly List<Query> _queries;

    public Parser(IListener listener)
    {
        _listener = listener;
        _queries = new List<Query>();

        _listener.QueryFound = OnQueryFound;
    }

    public IEnumerable<Query> Run()
    {

        return _queries;
    }

    private void OnQueryFound(Query query)
    {
        _queries.Add(query);
    }
}