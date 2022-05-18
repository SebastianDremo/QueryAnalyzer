using QueryAnalyzer.Domain;
using QueryAnalyzer.Parser.Interfaces;

namespace QueryAnalyzer.Parser;

public class SqlListener : SqlParserBaseListener, IListener
{
    public Action<Query> QueryFound { get; set; }

    public override void EnterSelect_statement(SqlParser.Select_statementContext context)
    {
        var query = new Query();
        var tableSourcesContext = context.query_expression().query_specification()
            .table_sources().table_source()
            .FirstOrDefault();

        if (tableSourcesContext is null) return;

        var tableName = tableSourcesContext.table_source_item_joined()
            .table_source_item().table_name_with_hint()
            .table_name().table
            .GetText();

        if (string.IsNullOrEmpty(tableName)) return;

        query.FromTable = tableName;

        var tableSchema = tableSourcesContext.table_source_item_joined()
            .table_source_item().table_name_with_hint()
            .table_name().schema?
            .GetText();

        var joinPartContexts = tableSourcesContext.table_source_item_joined().join_part();

        foreach (var joinPartContext in joinPartContexts)
        {
            var join = new Join();
            var joinOnContext = joinPartContext.join_on();
            var joinTableName = joinOnContext.table_source().table_source_item_joined().table_source_item().table_name_with_hint().table_name().table.GetText();
            var joinTableSchema = joinOnContext.table_source().table_source_item_joined().table_source_item().table_name_with_hint().table_name().schema.GetText();
            join.JoinedTable = joinTableName;

            var leftJoinPart = new JoinPart();
            var rightJoinPart = new JoinPart();
        }
    }
}