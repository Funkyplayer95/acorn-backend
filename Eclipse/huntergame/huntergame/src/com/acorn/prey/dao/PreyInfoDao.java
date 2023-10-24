package com.acorn.prey.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.acorn.prey.entity.PreyTab;

public class PreyInfoDao {
	private final static String DB_URL =
			"jdbc:oracle:thin:@localhost:1521:xe";
	private final static String USER = "kht123";
	private final static String PASS = "kht123";
	
	public List<PreyTab> getPreyInfo() {	
		PreyTab preyTab				= null;
		List<PreyTab> preyTabsList 	= null;
		
		String sql = "SELECT id, health, attackpower,"
				+ "defencepower, x, y,"
				+ "type FROM huntertab";
		
		Connection 	conn 			= null;
		PreparedStatement pstmt 	= null;
		ResultSet 	rs 				= null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			preyTabsList = new ArrayList<PreyTab>();
	
			while(rs.next()) {
				preyTab = new PreyTab();
				preyTab.setId(rs.getInt("id"));
				preyTab.setHealth(rs.getInt("health"));
				preyTab.setAttackpower(rs.getInt("attackpower"));
				preyTab.setDefencepower(rs.getInt("defencepower"));
				preyTab.setX(rs.getInt("x"));
				preyTab.setY(rs.getInt("y"));
				preyTab.setType(rs.getInt("type"));

				preyTabsList.add(preyTab);
				preyTab = null;
			}
			
			rs.close();
			pstmt.close();
			conn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return preyTabsList;
	}
}