package builder;

public class Main {
    public static void main() {
        SqlQuery sqlQuery1 = new SqlQuery.SqlQueryBuilder().from("order").build();

        SqlQuery sqlQuery2 = new SqlQuery.SqlQueryBuilder().from("order").where("count > 2").build();

        SqlQuery sqlQuery3 = new SqlQuery.SqlQueryBuilder().limit(100).from("order").order("created_at DESC")
                .offset(400)
                .where("count > 2")
                .where("status = 3")
                .build();

        System.out.println(sqlQuery1.toString());
        System.out.println(sqlQuery2.toString());
        System.out.println(sqlQuery3.toString());

    }
}
