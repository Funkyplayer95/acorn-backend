package com.team.ordersales.stockinfo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.team.ordersales.comm.ConfigureImpl;

public class StockInfoFullDao {
	
	private static String QUERY2 = "update stockinfo set rawmaterialqty = 50";

	public static ResultSet getStockqtyFull()throws SQLException{
		System.out.println(1);
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		System.out.println(2);
		Statement stmt = null;
		System.out.println(3);
		Connection conn = ConfigureImpl.getConnObject();
		System.out.println(4);
		ResultSet rs = null;
		System.out.println(5);
		stmt = conn.createStatement();
		System.out.println(6);
		rs = stmt.executeQuery(QUERY2);
		System.out.println(7);
		
		rs.close();
		stmt.close();
		//conn.close();

		return rs;
	}
}