package ConnectDB;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataConnect {

    public static void main(String[] args) {

        Connection conn;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/evedence", "root", "123456");
        } catch (Exception e) {

            e.printStackTrace();
        }

    }
}
