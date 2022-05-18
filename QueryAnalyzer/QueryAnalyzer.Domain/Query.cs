using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace QueryAnalyzer.Domain
{
    class Query
    {
        string FromTable { get; set; }

        List<Join> Joins { get; set; }
    }
}
