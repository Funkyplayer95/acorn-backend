package com.team.ordersales.stockinfo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.team.ordersales.comm.ConfigureImpl;

public class StockInfoFullDao {
	
	private static Connection conn = null;
	
	private static String QUERY2 = "update insalesgoods set rawmaterialqty = 50";
	private static String QUERY3 = "update stockinfo set rawmaterialqty = 50";
	private static String QUERY4 = "update ordergoods set rawmaterialqty = 50";
	
	private static String QUERY5 = "update insalesgoods set rawmaterialqty = 50 where rawmaterialcode = ?";
	private static String QUERY6 = "update stockinfo set rawmaterialqty = 50 where rawmaterialcode = ?";
	private static String QUERY7 = "update ordergoods set rawmaterialqty = 50 where rawmaterialcode = ?";

	public static void getStockqtyFull(String sCode)throws SQLException{
		
		conn = ConfigureImpl.getConnObject();
		
		if(sCode.equals("all")) {
			Statement stmt = null;
			
			stmt = conn.createStatement();
			stmt.executeQuery(QUERY2);
			stmt.executeQuery(QUERY3);
			stmt.executeQuery(QUERY4);
			
			stmt.close();
			
		}else {
			PreparedStatement pstmt = null;
			
			pstmt = conn.prepareStatement(QUERY5);
			pstmt.setString(1, sCode);
			pstmt.executeQuery(QUERY5);
			
			pstmt = conn.prepareStatement(QUERY6);
			pstmt.setString(1, sCode);
			pstmt.executeQuery(QUERY6);
			
			pstmt = conn.prepareStatement(QUERY7);
			pstmt.setString(1, sCode);
			pstmt.executeQuery(QUERY7);
			
			pstmt.close();
		}
	}
}