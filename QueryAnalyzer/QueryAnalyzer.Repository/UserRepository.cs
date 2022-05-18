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

    public bool Connect()
    {
        try
        {
            using(var connection = new SqlConnection(_connectionString))
            {
                connection.Open();
            }
            return true;
        }
        catch (SqlException e)
        {
            Console.WriteLine(e.Message);
            return false;
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