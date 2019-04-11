package com.inventory.Connection;

import com.mysql.cj.exceptions.MysqlErrorNumbers;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataConnect {
//    
//    private static final String Username = "root";
//    private static final String PassWord= "123456";
//    

    public static void main(String[] args) {
        Connection conn ;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/salesmen", "root", "123456");
            System.out.println("Connection");
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

}
