using QueryAnalyzer.Domain;
using QueryAnalyzer.Repository;

namespace QueryAnalyzer.Service;

public class PrimaryKeyService
{
	
	public bool CheckIfPKExists(string schema, string table, string column, UserRepository repository)
	{
		var schemaPart = string.Empty;
	    if (!string.IsNullOrEmpty(schema))
	    {
		    schemaPart = $@"AND t.[schema] = '{schema}'";
	    }
	    string query = $@"SELECT 
							t.[name] AS [table],
							t.[schema],
							c.[name] AS [column]
						FROM
							[unique_constraints] uc
						INNER JOIN [tables] t ON
							uc.[table_id] = t.[table_id]
						INNER JOIN [unique_constraints_columns] ucc ON
							uc.[unique_constraint_id] = ucc.[unique_constraint_id]
						INNER JOIN [columns] c ON
							ucc.[column_id] = c.[column_id]
						WHERE 
							t.[name] = '{table}' 
							{schemaPart}
							AND c.[name] = '{column}'
							AND uc.[primary_key] = 1 ";

		return repository.SendScalarQuery(query); 
    }
}