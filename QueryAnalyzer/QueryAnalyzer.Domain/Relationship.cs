using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace QueryAnalyzer.Domain
{
    class Relationship
    {
        public string PKTable { get; set; }

        public string FKTable { get; set; }

        public List<string> PKColumns { get; set; }

        public List<string> FKColumns { get; set; }
    }
}
