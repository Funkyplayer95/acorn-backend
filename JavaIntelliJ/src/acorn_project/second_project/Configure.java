package com.acorn.jdbc_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Configure {
	
	public static Connection conn = null;
	
	private static String DB_URL = "jdbc:oracle:thin:@192.168.0.71:1521:xe";
	private static String USER = "project";
	private static String PASS = "ljuneh";
	
	public Configure() {}
	
	public static Connection getConnObject() {
		if(conn == null) {
			try {
				conn = DriverManager.getConnection(DB_URL, USER, PASS);
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return conn;
	}
}
