package com.acorn.jdbc_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UserActivity {
	private static String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String USER = "project";
	private static String PASS = "ljuneh";
	private static String QUERY1 = "select i.seq, i.goodscode, i.goodsname, r.rawmaterialname, i.rawmaterialquantity\r\n"
			+ "from insalesgoods i, rawmaterial r\r\n"
			+ "where i.rawmaterialcode = r.rawmaterialcode";
	
	private Scanner sc;
	
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	
	public UserActivity(Scanner sc) {
		this.sc = sc;
	}
	
	public void searchInsalesGoods() {
		try {
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(QUERY1);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
