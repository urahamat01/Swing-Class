
package swing.MySqlDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

public class DblConnection {
    
    public static Connection getDbConnection(){
    
    Connection connection = null;
    
   try{
    connection = DriverManager.getConnection(" com.mysql.jdbc.Driver", "jdbc:mysql://localhost:3306/sonoo ","tesct","root","123456");
    
       System.out.println("::connected::");
    
    }catch(SQLException ex){
    Logger.getLOgger(DblConnection.class.getName()).log(Leve.SEVER,null,+ex);
    
    
    }
   return connection;
    }
    
}
