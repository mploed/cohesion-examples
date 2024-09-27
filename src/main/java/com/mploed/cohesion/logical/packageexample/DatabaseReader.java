package com.mploed.cohesion.logical.packageexample;

import java.sql.*;

public class DatabaseReader {
    private static final String DB_URL = "jdbc:h2:~/test"; // H2 Database
    private static final String USER = "sa";
    private static final String PASS = "";

    public String readFromDatabase() {
        String result = "";
        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM mytable");

            while (rs.next()) {
                result += rs.getString("columnname") + "\n";
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}