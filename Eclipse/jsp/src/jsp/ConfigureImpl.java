package jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConfigureImpl implements Configure{
	public static Connection conn = null;

	private ConfigureImpl() {	
	}
	
	public static Connection getConnObject() {
		if(conn != null) {
			try {
				conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
		
		return conn;
	}	
}

