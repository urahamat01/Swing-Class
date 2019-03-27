
package ProdConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DBConnection {
    
    static  Connection con = null;
    public static Connection getConnect(){
        
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/product", "root","123456");
            System.out.println("Connection");
        } catch (SQLException ex) {
          ex.printStackTrace();
        }
        return con;
    }
    
}
