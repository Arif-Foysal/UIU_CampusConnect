package com.example.uiu_campusconnect;

import java.sql.Connection;
import java.sql.DriverManager;


public class DatabaseUtil {
    private static final String URL = "jdbc:mysql://localhost:3306/campus_connect";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "asdf1234";

    public static Connection getConnection() throws Exception {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

}
