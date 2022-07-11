package com.example.twoeurocoins;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnection {
    public Connection databaseLink;

    public Connection getConnection() {
        String databaeName = "two_euro_coins";
        String databaseUser = "root";
        String databasePassword = "1234";
        String url = "jdbc:mysql://localhost/"+databaeName;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            databaseLink = DriverManager.getConnection(url, databaseUser, databasePassword);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return databaseLink;
    }
}
