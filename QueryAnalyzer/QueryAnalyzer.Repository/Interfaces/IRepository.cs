namespace QueryAnalyzer.Repository.Interfaces;

public interface IRepository
{
    bool Connect();
    bool SendScalarQuery(string query);
}