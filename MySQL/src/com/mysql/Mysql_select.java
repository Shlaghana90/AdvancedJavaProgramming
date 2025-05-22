package com.mysql;

import java.sql.*;
import java.util.Properties;

public class Mysql_select {
    public static void main(String[] args) {
        try {
            Connection dbConnection = null;
            String url = "jdbc:mysql://localhost:3306/test";
            Properties info = new Properties();
            info.put("user", "root");
            info.put("password", "");

            dbConnection = DriverManager.getConnection(url, info);
            System.out.println("Successfully connected to MySQL database 'test'");

            String query = "SELECT * FROM coffee";
            Statement st = dbConnection.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                int id = rs.getInt("id");
                String coffee_name = rs.getString("coffee_name");
                int price = rs.getInt("price");
                System.out.format("%d, %s, %d\n", id, coffee_name, price);S
            }

            String insertQuery = "INSERT INTO coffee (coffee_name, price) VALUES (?, ?)";
            PreparedStatement stmt = dbConnection.prepareStatement(insertQuery);
            stmt.setString(1, "Tajmahal");
            stmt.setInt(2, 950);
            stmt.executeUpdate();

            System.out.println("New coffee product inserted successfully.");

            stmt.close();
            st.close();
            dbConnection.close();

        } catch (SQLException e) {
            System.out.println("SQL Exception:");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("General Exception:");
            e.printStackTrace();
        }
    }
}
