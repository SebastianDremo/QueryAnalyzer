using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace QueryAnalyzer.Domain
{
    class JoinClause
    {
        public JoinPart LeftPart { get; set; }

        public JoinPart RightPart { get; set; }
    }
}
