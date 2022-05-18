using QueryAnalyzer.Parser;

Console.WriteLine("Insert your query:");
Console.WriteLine();

var query = Console.ReadLine();

var parser = new Parser(new SqlListener());