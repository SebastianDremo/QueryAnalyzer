using QueryAnalyzer.Domain;
using QueryAnalyzer.Parser;
using QueryAnalyzer.Repository;
using QueryAnalyzer.Service;


Console.WriteLine("Insert your query:");
Console.WriteLine();

// var query = Console.ReadLine();

var script1 = @"SELECT
SalesOrderNumber,
EmailAddress,
Address.City as BillingCity
FROM
SalesLT.SalesOrderHeader 
INNER JOIN SalesLT.Customer ON
SalesOrderHeader.CustomerID = Customer.CustomerID
INNER JOIN SalesLT.Address ON
SalesOrderHeader.BillToAddressID = SalesLT.Address.AddressID;";

var script2 = @"SELECT
SalesOrderNumber,
EmailAddress,
Address.City as BillingCity
FROM
SalesLT.Customer 
INNER JOIN SalesLT.SalesOrderHeader ON
SalesOrderHeader.CustomerID = Customer.CustomerID
INNER JOIN SalesLT.Address ON
SalesOrderHeader.BillToAddressID = SalesLT.Address.AddressID;";


var script3 = $@"SELECT
SalesOrderNumber,
EmailAddress,
Address.City as BillingCity
FROM SalesLT.Address 
JOIN SalesLT.SalesOrderHeader ON
SalesOrderHeader.ShipToAddressID = Address.AddresssID
INNER JOIN SalesLT.Customer ON
SalesOrderHeader.CustomerID = Customer.CustomerID";

var parser = new Parser(script3);
var queries = parser.Run();

var repository = new UserRepository("localhost", 3306, "sa", "bocian1412", "dataedo_innovation_day");

var relatioshipService = new RelationshipService();
var uniqueKeyService = new UniqueKeyService();
var relationships = new List<Relationship>();
foreach (var query in queries)
{
    relationships.AddRange(relatioshipService.BuildRelationshipsFromQuery(query, repository));
}
Console.WriteLine("End");