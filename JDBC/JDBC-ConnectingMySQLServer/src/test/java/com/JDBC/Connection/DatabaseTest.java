package com.JDBC.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

import org.testng.annotations.Test;

public class DatabaseTest {
    @Test
    public void testDatabaseConnection() throws SQLException, ClassNotFoundException {
        // 1. Define connection parameters
        String dbURL = "jdbc:mysql://localhost:3306/SeleniumAutomation";
        String username = "root";
        String password = "root";

        // 2. Load JDBC Driver (optional in newer versions) and get connection
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(dbURL, username, password);
        Statement stmt = con.createStatement();

        // 3. Execute a query
        String query = "SELECT * FROM SeleniumAutomation.book_detl;";
        ResultSet rs = stmt.executeQuery(query);

        // 4. Process the results
        while (rs.next()) {
            String auth = rs.getString("author");
            String tit = rs.getString("title");
            System.out.println("author: " + auth + ", title: " + tit);
        }

        // 5. Close the connection
        con.close();
    }
}
