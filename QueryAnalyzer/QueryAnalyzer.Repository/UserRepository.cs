using System.Data;
using QueryAnalyzer.Repository.Interfaces;
using Microsoft.Data.SqlClient;

namespace QueryAnalyzer.Repository;

public class UserRepository : IRepository
{
    private readonly string _connectionString;

    public UserRepository(string connectionString)
    {
        _connectionString = connectionString;
    }

    public UserRepository(string host,
        int port,
        string username,
        string password,
        string database)
    {
        var builder = new SqlConnectionStringBuilder();
        builder.DataSource = host;
        builder.InitialCatalog = database;
        builder.UserID = username;
        builder.Password = password;
        builder.TrustServerCertificate = true;
        
        this._connectionString = builder.ConnectionString;
    }

    public string GetDatabaseName()
    {
        var builder = new SqlConnectionStringBuilder(this._connectionString);

        return builder.InitialCatalog;
    }
    
    public SqlDataReader SendQuery(string query)
    {
        try
        {
            var connection = new SqlConnection(_connectionString);
            using (var command = new SqlCommand(query, connection))
            {
                connection.Open();
                var reader = command.ExecuteReader(CommandBehavior.CloseConnection);
                return reader;
            }
        }
        catch (SqlException e)
        {
            Console.WriteLine(e.Message);
            return null;
        }
    }

    public bool SendScalarQuery(string query)
    {
        try
        {
            using (var connection = new SqlConnection(_connectionString))
            {
                connection.Open();
                using (var command = new SqlCommand(query, connection))
                {
                    object result = command.ExecuteScalar();
                    return result != null;
                }
            }
        }
        catch (SqlException e)
        {
            Console.WriteLine(e.Message);
            return false;
        }
    }
}