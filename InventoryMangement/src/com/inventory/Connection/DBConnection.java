/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inventory.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Md Yasin Arif
 */
public class DBConnection {
    static Connection con = null;
    public static Connection getConnect(){
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/salesmgmt", "root", "123456");
            System.out.println("Connected");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return con;
    }

    public static Connection getDBConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
