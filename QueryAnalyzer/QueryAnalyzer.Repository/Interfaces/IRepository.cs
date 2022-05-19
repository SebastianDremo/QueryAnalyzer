using Microsoft.Data.SqlClient;

namespace QueryAnalyzer.Repository.Interfaces;

public interface IRepository
{
    SqlDataReader SendQuery(string query);

    bool SendScalarQuery(string query);
}