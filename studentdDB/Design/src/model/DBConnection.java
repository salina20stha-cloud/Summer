package model;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    private static final String URL =
            "jdbc:postgresql://localhost:5432/studentdb";

    private static final String USER = "postgres";
    private static final String PASSWORD = "@aa6y55LN"; // Replace with your PostgreSQL password

    public static Connection getConnection() throws Exception {

        Class.forName("org.postgresql.Driver");

        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}