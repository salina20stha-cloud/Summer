package DB;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

    public static Connection getConnection() throws Exception {

        Class.forName("org.postgresql.Driver");

        String url = "jdbc:postgresql://localhost:5432/college";
        String username = "postgres";
        String password = "@aa6y55LN";

        return DriverManager.getConnection(url, username, password);
    }
}