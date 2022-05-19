using QueryAnalyzer.Domain;

namespace QueryAnalyzer.Service;

public class PropositionsService
{
    public string ProposeForeignKey(Relationship relationship)
    {
        return ProposeForeignKey(
                relationship.PKSchema, //replace with relationship.PKSchema after merge
                relationship.PKTable, 
                relationship.PKColumns,
                relationship.FKSchema, //relationship.FKSChema
                relationship.FKTable, 
                relationship.FKColumns);
               
    }
    //its messy right here but I just want to go to sleep at this point
    public string ProposeForeignKey(string pkSchema, string pkTable, List<string> pkColumns, string fkSchema, string fkTable, List<string> fkColumns)
    {
        if (!string.IsNullOrEmpty(pkSchema)) pkSchema += ".";
        if (!string.IsNullOrEmpty(fkSchema)) fkSchema += ".";
        
       var text = @$"ALTER TABLE {fkSchema}{fkTable} ADD CONSTRAINT FK_{fkTable}{pkTable}
                     FOREIGN KEY ({string.Join(",", fkColumns)}) REFERENCES {pkSchema}{pkTable}({string.Join(",", pkColumns)});";

        return text;
    }
}