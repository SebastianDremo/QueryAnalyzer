using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using QueryAnalyzer.Domain;
using QueryAnalyzer.Parser.Interfaces;

namespace QueryAnalyzer.Parser;

public class Parser
{
    private readonly IListener _listener;
    private readonly List<Query> _queries;
    private readonly List<IndexProposition> _indexPropositions;
    private readonly ParseTreeWalker _treeWalker;
    private readonly SqlParser _parser;
        
    public Parser(string script)
    {
        _queries = new List<Query>();
        _indexPropositions = new List<IndexProposition>();

        var inputStream = new AntlrInputStream(script);
        var lexer = new SqlLexer(inputStream);
        var tokens = new CommonTokenStream(lexer);
        _parser = new SqlParser(tokens)
        {
            BuildParseTree = true
        };
        
        _treeWalker = new ParseTreeWalker();

        _listener = new SqlListener
        {
            QueryFound = OnQueryFound
        };
    }

    public IEnumerable<Query> Run()
    {
        var tree = _parser.tsql_file();
        _treeWalker.Walk((IParseTreeListener) _listener, tree);
        
        return _queries;
    }

    public IEnumerable<IndexProposition> GetIndexPropositions()
    {
        return _indexPropositions;
    }

    private void OnQueryFound(Query query)
    {
        _queries.Add(query);
    }

    private void OnColumnForIndexFound(string? tableSchema, string? tableName, string? columnName)
    {
        var proposition = new IndexProposition
        {
            TableSchema = tableSchema,
            TableName = tableName,
            ColumnName = columnName
        };
        
        _indexPropositions.Add(proposition);
    }
}