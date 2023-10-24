package com.acorn.hunter.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.acorn.hunter.entity.HunterTab;

public class HunterInfoDao {
	private final static String DB_URL =
			"jdbc:oracle:thin:@localhost:1521:xe";
	private final static String USER = "kht123";
	private final static String PASS = "kht123";
	
	public List<HunterTab> getHunterInfo(int iType) {	
		HunterTab hunterTab				= null;
		List<HunterTab> hunterTabsList 	= null;

		String sql = "SELECT id, health, attackpower,"
				+ "defencepower, cash, speed, x, y,"
				+ "type FROM huntertab "
				+ "WHERE type=?";
		
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
			pstmt.setInt(1, iType);
			rs = pstmt.executeQuery();
			
			hunterTabsList = new ArrayList<HunterTab>();
			
			while(rs.next()) {
				hunterTab = new HunterTab();
				hunterTab.setId(rs.getInt("id"));
				hunterTab.setHealth(rs.getInt("health"));
				hunterTab.setAttackpower(rs.getInt("attackpower"));
				hunterTab.setDefencepower(rs.getInt("defencepower"));
				hunterTab.setCash(rs.getInt("cash"));
				hunterTab.setSpeed(rs.getInt("speed"));
				hunterTab.setX(rs.getInt("x"));
				hunterTab.setY(rs.getInt("y"));
				hunterTab.setType(rs.getInt("type"));

				hunterTabsList.add(hunterTab);
				hunterTab = null;
			}
			
			rs.close();
			pstmt.close();
			conn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return hunterTabsList;
	}
}