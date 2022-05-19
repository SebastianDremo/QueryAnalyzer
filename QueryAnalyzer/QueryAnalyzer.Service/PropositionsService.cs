using QueryAnalyzer.Domain;

namespace QueryAnalyzer.Service;

public class PropositionsService
{
    public string ProposeForeignKey(Relationship relationship)
    {
        return ProposeForeignKey(
                relationship.PKSchema, //replace with relationship.PKSchema after merge
                relationship.PKTable, 
                relationship.PKColumn,
                relationship.FKSchema, //relationship.FKSChema
                relationship.FKTable, 
                relationship.FKColumn);
               
    }
    //its messy right here but I just want to go to sleep at this point
    public string ProposeForeignKey(string pkSchema, string pkTable, string pkColumn, string fkSchema, string fkTable, string fkColumn)
    {
        if (!string.IsNullOrEmpty(pkSchema)) pkSchema += ".";
        if (!string.IsNullOrEmpty(fkSchema)) fkSchema += ".";
        return  @$"ALTER TABLE {fkSchema}{fkTable} ADD CONSTRAINT FK_{fkTable}_{pkTable}
                     FOREIGN KEY ({fkColumn}) REFERENCES {pkSchema}{pkTable}({pkColumn});";
    }

    public string ProposeIndex(IndexProposition proposition)
    {
        if (!string.IsNullOrEmpty(proposition.TableSchema)) proposition.TableSchema += ".";

        return $"CREATE INDEX IX_{proposition.TableName}_{proposition.ColumnName} ON {proposition.TableSchema}{proposition.TableName} ({proposition.ColumnName});";
    }
}