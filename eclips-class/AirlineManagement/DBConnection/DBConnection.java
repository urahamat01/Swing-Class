package DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	static Connection conn = null;

	public static Connection getConnection() {
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/salesmgmt", "root", "123456");
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return conn;
	}
}
