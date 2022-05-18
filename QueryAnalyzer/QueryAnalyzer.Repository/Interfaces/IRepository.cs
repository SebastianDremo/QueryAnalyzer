namespace QueryAnalyzer.Repository.Interfaces;

public interface IRepository
{
    bool Connect();
    bool SendQuery(string query);
}