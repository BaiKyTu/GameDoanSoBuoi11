package com.cybersoft.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySqlConnection {

    public static Connection getConnection(){
        Connection connection = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/account",
                   "root",
                    "admin123");


        } catch (Exception e){
            System.out.println("Error connect database"+e.getMessage());
        }
        return connection;
    }

}
