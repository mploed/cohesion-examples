package com.mploed.cohesion.logical.classexample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.*;

public class LogicalCohesion {
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
    public String readFile(String path) {
        String content = "";
        try {
            content = new String(Files.readAllBytes(Paths.get(path)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }
    public String readFromWebsite(String websiteURL) {
        StringBuilder content = new StringBuilder();
        try {
            URL url = new URL(websiteURL);
            URLConnection conn = url.openConnection();
            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));

            String inputLine;
            while ((inputLine = br.readLine()) != null) {
                content.append(inputLine);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return content.toString();
    }
}
