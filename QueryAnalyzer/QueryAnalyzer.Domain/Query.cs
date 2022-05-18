using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace QueryAnalyzer.Domain
{
    public class Query
    {
        public string FromTable { get; set; }

        public List<Join> Joins { get; set; }
    }
}
