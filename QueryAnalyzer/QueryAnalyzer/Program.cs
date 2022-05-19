using QueryAnalyzer.Domain;
using QueryAnalyzer.Parser;
using QueryAnalyzer.Repository;
using QueryAnalyzer.Service;


Console.WriteLine("Insert your query:");
Console.WriteLine();

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

var script7 = $@"SELECT 
					tr.[fk_table_id]
				FROM
					[tables_relations] tr
				JOIN [tables_relations_columns] trc ON
					tr.[table_relation_id] = trc.[table_relation_id]
				JOIN [tables] pk_tab ON
					tr.[pk_table_id] = pk_tab.[table_id]
				JOIN [tables] fk_tab ON
					tr.[fk_table_id] = fk_tab.[table_id]
				JOIN [columns] pk_c ON
					trc.[column_pk_id] = pk_c.[column_id]
				JOIN [columns] fk_c ON
					trc.[column_fk_id] = fk_c.[column_id]
				WHERE
					pk_tab.[schema] = 'SalesLT'
					AND pk_tab.[name] = 'Address'
					AND pk_c.[name] = 'AddressID'
					AND fk_tab.[schema] = 'SalesLT'
					AND fk_tab.[name] = 'CustomerAddress'
					AND fk_c.[name] = 'AddressID'";

var script8 = $@"SELECT 
					*
				FROM [dbo].[tables]
				WHERE [tables].[description] = 'description';";

var parser = new Parser(script8);
var queries = parser.Run();
var indexPropositions = parser.GetIndexPropositions();

var repository = new UserRepository("localhost", 3306, "sa", "bocian1412", "dataedo_innovation_day");
var database = new UserRepository("localhost", 3306, "sa", "bocian1412", "AdventureWorksLT2019");

var relatioshipService = new RelationshipService();
var uniqueKeyService = new PrimaryKeyService();
var propositionService = new PropositionsService();

var relationships = new List<Relationship>();

Console.WriteLine("Propositions based on query");
foreach (var query in queries)
{
    relationships.AddRange(relatioshipService.BuildRelationshipsFromQuery(query, repository, database));
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