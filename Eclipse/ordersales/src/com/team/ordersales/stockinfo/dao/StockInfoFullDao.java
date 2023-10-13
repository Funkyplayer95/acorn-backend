package com.team.ordersales.stockinfo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.team.ordersales.comm.ConfigureImpl;

public class StockInfoFullDao {
	
	private static String QUERY2 = "update insalesgoods set rawmaterialqty = 50";
	private static String QUERY3 = "update stockinfo set rawmaterialqty = 50";
	private static String QUERY4 = "update ordergoods set rawmaterialqty = 50";
	

	public static ResultSet getStockqtyFull()throws SQLException{
		System.out.println(1);
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		Statement stmt = null;
		Connection conn = ConfigureImpl.getConnObject();
		ResultSet rs = null;
		stmt = conn.createStatement();
		rs = stmt.executeQuery(QUERY2);
		rs = stmt.executeQuery(QUERY3);
		rs = stmt.executeQuery(QUERY4);
		
		rs.close();
		stmt.close();
		//conn.close();

		return rs;
	}
}