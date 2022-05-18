﻿namespace QueryAnalyzer.Service;

public class PropositionsService
{
    //its messy right here but I just want to go to sleep at this point
    public void ProposeForeignKey(string pkSchema, string pkTable, List<string> pkColumns, string fkSchema, string fkTable, List<string> fkColumns)
    {
        if (!string.IsNullOrEmpty(pkSchema)) pkSchema += ".";
        if (!string.IsNullOrEmpty(fkSchema)) fkSchema += ".";
        
        var pkColumnsText = string.Join(",", pkColumns);
        var fkColumnsText = string.Join(",", fkColumns);

        var text = @$"ALTER TABLE {fkSchema}{fkTable} ADD CONSTRAINT FK_{fkTable}{pkTable}
                     FOREIGN KEY ({fkColumnsText.SkipLast(2)}) REFERENCES {pkSchema}{pkTable}({pkColumnsText.SkipLast(2)});";
        
        Console.WriteLine(text);
    }
}