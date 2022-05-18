using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace QueryAnalyzer.Domain
{
    public class Join
    {
        public string JoinedTable { get; set; }

        public List<JoinClause> JoinClauses { get; set; }
    }
}
