using QueryAnalyzer.Domain;
using QueryAnalyzer.Parser;
using QueryAnalyzer.Repository;
using QueryAnalyzer.Service;


// var query = Console.ReadLine();

//script1-3 - represents different orders of same tables in FROM and JOIN clauses
//script4 - shows invalid FK candidate which is invalid due to value not present in PK column
//script5 - shows invalid FK candidate, because none of JOINed columns is PK
//script6 - shows invalid FK candidate, because both of JOINEDed columns are PK, what makes not much sense
//sciprt7,8 - index propositions

var script1 = @"SELECT
SalesOrderNumber,
EmailAddress,
Address.City as BillingCity
FROM
SalesLT.SalesOrderHeader 
INNER JOIN SalesLT.Customer ON
SalesOrderHeader.CustomerID = Customer.CustomerID
INNER JOIN SalesLT.Address ON
SalesOrderHeader.BillToAddressID = SalesLT.Address.AddressID
WHERE
    SalesLT.Address.City = 'Oxon';";

var script2 = @"SELECT
SalesOrderNumber,
EmailAddress,
Address.City as BillingCity
FROM
SalesLT.Customer 
INNER JOIN SalesLT.SalesOrderHeader ON
SalesOrderHeader.CustomerID = Customer.CustomerID
INNER JOIN SalesLT.Address ON
SalesOrderHeader.BillToAddressID = SalesLT.Address.AddressID
WHERE
    SalesLT.Address.City = 'Chicago';";


var script3 = $@"SELECT
SalesOrderNumber,
EmailAddress,
Address.City as BillingCity
FROM SalesLT.Address 
JOIN SalesLT.SalesOrderHeader ON
SalesOrderHeader.BillToAddressID = Address.AddressID
INNER JOIN SalesLT.Customer ON
SalesOrderHeader.CustomerID = Customer.CustomerID";


var script4 = $@"SELECT
SalesOrderNumber,
EmailAddress,
Address.City as ShippingCity
FROM
SalesLT.SalesOrderHeader 
INNER JOIN SalesLT.Customer ON
SalesOrderHeader.CustomerID = Customer.CustomerID
INNER JOIN SalesLT.Address ON
SalesOrderHeader.ShipToAddressID = SalesLT.Address.AddressID;";

var script5 = $@"SELECT
SalesOrderNumber,
EmailAddress,
Address.City as ShippingCity
FROM
SalesLT.SalesOrderHeader 
INNER JOIN SalesLT.Customer ON
SalesOrderHeader.CustomerID = Customer.rowguid";

var script6 = $@"SELECT
SalesOrderNumber,
EmailAddress,
Address.City as ShippingCity
FROM
SalesLT.SalesOrderHeader 
INNER JOIN SalesLT.Customer ON
SalesOrderHeader.SalesOrderID = Customer.CustomerID";

var script7 = @"SELECT 
               *
            FROM tables
            WHERE tables.description = 'description';";

var dataedoScript = @"SELECT 
	                        triggers_changes.before_before,
	                        triggers.name
                        FROM dbo.triggers
                        INNER JOIN dbo.triggers_changes ON
	                        triggers.trigger_id = triggers_changes.trigger_id;";




var repository = new UserRepository("localhost", 3306, "sa", "bocian1412", "dataedo_innovation_day");
var AdventureWorksDB = new UserRepository("localhost", 3306, "sa", "bocian1412", "AdventureWorksLT2019");
var DataedoDB = new UserRepository("localhost", 3306, "sa", "bocian1412", "dataedo_10.3");

var script = dataedoScript;
var database = DataedoDB;

var parser = new Parser(script);
var queries = parser.Run();
var indexPropositions = parser.GetIndexPropositions();

var relatioshipService = new RelationshipService();
var uniqueKeyService = new PrimaryKeyService();
var propositionService = new PropositionsService();

var relationships = new List<Relationship>();

Console.WriteLine("Propositions based on query");
foreach (var query in queries)
{
    relationships.AddRange(relatioshipService.BuildRelationshipsFromQuery(query, database, repository));
    foreach (var relationship in relationships)
    {
        Console.WriteLine(propositionService.ProposeForeignKey(relationship));
    }
}

Console.WriteLine();
Console.WriteLine();
Console.WriteLine("Index propositions");
foreach (var indexProposition in indexPropositions)
{
    Console.WriteLine(propositionService.ProposeIndex(indexProposition)); 
}

Console.WriteLine();
Console.WriteLine();
Console.WriteLine("Propositions based on Dataedo repository");
var relationships2 = relatioshipService.GetFKForPKColumns(repository, database);
foreach (var relationship in relationships2)
{
    Console.WriteLine(propositionService.ProposeForeignKey(relationship));
}

Console.WriteLine("End");