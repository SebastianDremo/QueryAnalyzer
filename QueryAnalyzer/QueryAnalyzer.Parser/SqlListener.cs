﻿using QueryAnalyzer.Domain;
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

        var tableSchema = tableSourcesContext.table_source_item_joined()
            .table_source_item().table_name_with_hint()
            .table_name().schema?
            .GetText();

        query.FromTableName = tableName;
        query.FromTableSchema = tableSchema; //may be null ref here

        var joinPartContexts = tableSourcesContext.table_source_item_joined().join_part();

        foreach (var joinPartContext in joinPartContexts)
        {
            var join = new Join();
            var joinOnContext = joinPartContext.join_on();
            var joinTableName = joinOnContext.table_source().table_source_item_joined().table_source_item()
                .table_name_with_hint().table_name().table.GetText();
            var joinTableSchema = joinOnContext.table_source().table_source_item_joined().table_source_item()
                .table_name_with_hint().table_name().schema.GetText();
            join.JoinedTableName = joinTableName;
            join.JoinedTableSchema = joinTableSchema;

            var leftJoinPart = new JoinPart();
            var rightJoinPart = new JoinPart();

            var onCondition = joinOnContext.search_condition().predicate();
            leftJoinPart.TableName = onCondition.expression()[0]?.full_column_name().tablename?.GetText();
            leftJoinPart.Column = onCondition.expression()[0]?.full_column_name().column_name?.GetText();
            leftJoinPart.TableSchema = onCondition.expression()[0]?.full_column_name().schema?.GetText();
            leftJoinPart.TableSchema ??= leftJoinPart.TableName == joinTableName ? joinTableSchema : tableSchema;

            rightJoinPart.TableName = onCondition.expression()?[1]?.full_column_name().tablename?.GetText();
            rightJoinPart.Column = onCondition.expression()?[1]?.full_column_name().column_name?.GetText();
            rightJoinPart.TableSchema = onCondition.expression()?[1]?.full_column_name().schema?.GetText();
            rightJoinPart.TableSchema ??= rightJoinPart.TableName == joinTableName ? joinTableSchema : tableSchema;

            var joinClause = new JoinClause
            {
                LeftPart = leftJoinPart,
                RightPart = rightJoinPart
            };
            
            join.JoinClauses.Add(joinClause);
            query.Joins.Add(join);
        }
        
        QueryFound?.Invoke(query);
    }
}