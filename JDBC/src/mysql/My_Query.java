package mysql;

import java.sql.*;
import java.util.Properties;

public class My_Query {
    public static void main(String[] args) {
        Connection dbConnection = null;

        try {
            String url = "jdbc:mysql://localhost:3306/test";  // ensure port is correct
            Properties info = new Properties();
            info.put("user", "root");
            info.put("password", "");

            dbConnection = DriverManager.getConnection(url, info);

            if (dbConnection != null) {
                System.out.println("Successfully connected to MySQL database test\n");
            }

            String query = "SELECT * FROM coffee ORDER BY id";
            Statement stmt = dbConnection.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("coffee_name");
                int price = rs.getInt("price");

                // Exact spacing as per your screenshot
                System.out.println(id + " " + name + " " + price);
            }

            rs.close();
            stmt.close();
            dbConnection.close();
        } catch (Exception e) {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }
    }
}
