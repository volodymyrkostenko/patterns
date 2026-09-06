package builder;

public class SqlQuery {
    private String fromQuery;
    private String whereQuery;
    private String orderByQuery;
    private String limitQuery;
    private String offsetQuery;

    SqlQuery(SqlQueryBuilder data) {
        fromQuery = data.fromQuery;
        whereQuery = data.whereQuery;
        orderByQuery = data.orderByQuery;
        limitQuery = data.limitQuery;
        offsetQuery = data.offsetQuery;

    }

    public static class SqlQueryBuilder {
        private String fromQuery;
        private String whereQuery;
        private String orderByQuery;
        private String limitQuery;
        private String offsetQuery;

        public SqlQueryBuilder from(String from) {
            fromQuery = from;
            return this;
        }

        public SqlQueryBuilder where(String where) {
            if (whereQuery == null) {
                whereQuery = where;
            } else {
                whereQuery = whereQuery + " AND " + where;
            }
            return this;
        }

        public SqlQueryBuilder order(String order) {
            orderByQuery = order;
            return this;
        }

        public SqlQueryBuilder limit(Integer limit) {
            limitQuery = limit.toString();
            return this;
        }

        public SqlQueryBuilder offset(Integer offset) {
            offsetQuery = offset.toString();
            return this;
        }

        public SqlQuery build() {
            return new SqlQuery(this);
        }
    }

    public String toString() {
        String result = "SELECT * FROM " + fromQuery;

        if (whereQuery != null) {
            result += " WHERE " + whereQuery;
        }
        if (orderByQuery != null) {
            result += " ORDER BY " + orderByQuery;
        }

        if (limitQuery != null) {
            result += " LIMIT " + limitQuery;
        }

        if (offsetQuery != null) {
            result += " OFFSET " + offsetQuery;
        }

        result += ";";

        return result;
    }

}
