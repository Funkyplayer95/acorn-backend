package com.team.ordersales.stockinfo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.team.ordersales.comm.ConfigureImpl;

public class StockInfoFullDao {
	
	private static Connection conn = null;
	
	
	private static String QUERY2 = "update stockinfo set rawmaterialqty = 50";
	
	
	
	private static String QUERY5 = "update stockinfo set rawmaterialqty = rawmaterialqty + ? where rawmaterialcode=?";
	

	public static void getStockqtyFull(String sCode, String sSoloCode)throws SQLException{
		
		conn = ConfigureImpl.getConnObject();
		
		if(sCode.equals("all")) {
			
			Statement stmt = null;
			
			stmt = conn.createStatement();
			
			stmt.executeQuery(QUERY2);
			
			stmt.close();
		}
		else if(!sCode.equals("all")) {
			PreparedStatement pstmt = null;
			
			
			pstmt = conn.prepareStatement(QUERY5);
			pstmt.setString(1, sSoloCode);
			pstmt.setString(2, sCode);
			pstmt.executeQuery();
			
		}
	}
}