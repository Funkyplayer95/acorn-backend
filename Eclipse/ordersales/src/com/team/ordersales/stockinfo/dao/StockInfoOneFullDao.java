package com.team.ordersales.stockinfo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.team.ordersales.comm.ConfigureImpl;

public class StockInfoOneFullDao {
	
	private static String QUERY3 = "update stockinfo set rawmaterialqty = 50 where rawmaterialcode = ?";
	
	public static ResultSet getOneStockqtyFull()throws SQLException{
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		
		PreparedStatement pstmt = null;
		Connection conn = ConfigureImpl.getConnObject();
		ResultSet rs = null;
		
		String insertCode = null;
		
		pstmt = conn.prepareStatement(QUERY3);
		pstmt.setString(1,insertCode);
		rs = pstmt.executeQuery();
		
		rs.close();
		pstmt.close();
		//conn.close();

		return rs;
	}
}