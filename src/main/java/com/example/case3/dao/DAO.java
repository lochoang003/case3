package com.example.case3.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {
    private String jdbcURL = "jdbc:mysql://localhost:3306/movie?useSSL=false";
    private String jdbcUsername = "root";
    private String jdbcPassword = "123456";
    public Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
}
