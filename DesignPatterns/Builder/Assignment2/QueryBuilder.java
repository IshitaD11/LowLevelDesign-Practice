package ScalerLLD.DesignPatterns.Builder.Assignment2;

@WithBuilder
public class QueryBuilder {
    private String select;
    private String from;
    private String where;
    private String join;
    private String orderBy;
    private String groupBy;

    public QueryBuilder(Build build) {
        this.select = build.select;
        this.from = build.from;
        this.where = build.where;
        this.join = build.join;
        this.orderBy = build.orderBy;
        this.groupBy = build.groupBy;
    }

    public Build getBuilder(){
        return new Build();
    }


    public static class Build{
        private String select;
        private String from;
        private String where;
        private String join;
        private String orderBy;
        private String groupBy;

        public String getSelect() {
            return select;
        }

        public Build setSelect(String select) {
            this.select = select;
            return this;
        }
    
        public String getFrom() {
            return from;
        }

        public Build getFrom(String from) {
            this.from = from;
            return this;
        }
    
        public String getWhere() {
            return where;
        }

        public Build getWhere(String where) {
            this.where = where;
            return this;
        }
    
        public String getJoin() {
            return join;
        }

        public Build getJoin(String join) {
            this.join = join;
            return this;
        }
    
        public String getOrderBy() {
            return orderBy;
        }

        public Build getOrderBy(String orderBy) {
            this.orderBy = orderBy;
            return this;
        }
    
        public String getGroupBy() {
            return groupBy;
        }
        
        public Build getGroupBy(String groupBy) {
            this.groupBy = groupBy;
            return this;
        }

        public QueryBuilder build(){
            return new QueryBuilder(this);
        }
    }

}
