﻿using QueryAnalyzer.Parser;
using QueryAnalyzer.Service;


Console.WriteLine("Insert your query:");
Console.WriteLine();

// var query = Console.ReadLine();

var script = @"SELECT
soh.SalesOrderNumber,
c.EmailAddress,
a1.City as CityToShip,
Address.City as BillingCity
FROM
SalesLT.SalesOrderHeader soh
INNER JOIN SalesLT.Customer c ON
soh.CustomerID = c.CustomerID
JOIN SalesLT.Address a1 ON
soh.ShipToAddressID = a1.AddressID
INNER JOIN SalesLT.Address ON
soh.BillToAddressID = SalesLT.Address.AddressID;";

var parser = new Parser(script);
var queries = parser.Run();


foreach (var query in queries)
{
    var relationships = new RelationshipService().BuildRelationshipsFromQuery(query);
}