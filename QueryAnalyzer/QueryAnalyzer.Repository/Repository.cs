using QueryAnalyzer.Repository.Interfaces;

namespace QueryAnalyzer.Repository;

public class Repository : IRepository
{
    private readonly string _connectionString;
    
    public Repository(string connectionString)
    {
        _connectionString = connectionString;
    } 
    
    public bool Connect()
    {
        throw new NotImplementedException();
    }

    public bool SendQuery(string query)
    {
        throw new NotImplementedException();
    }
}