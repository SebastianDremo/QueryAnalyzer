namespace QueryAnalyzer.Service.Interfaces;

public interface IFileService
{
    bool CreateFile(string path);
    bool WriteToFile(string content);
}