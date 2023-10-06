package com.team.ordersales.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginCheckDao {
	
	private final static String DB_URL ="jdbc:oracle:thin:@192.168.0.123:1521:xe";
	private final static String USER = "team1";
	private final static String PASS = "team1";
	
	public static boolean loginCheck(String sParaId, 
		String sParaPasswd) {
		String sql = "SELECT id FROM userinfo "
				+ "WHERE id = ? AND passwd = ?";
		int iCnt = 0;
		Connection conn 		= null;
		PreparedStatement pstmt = null;
		ResultSet rs 			= null;
			
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		try {
			conn = 
				DriverManager.getConnection(DB_URL, USER, PASS);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, sParaId);
			pstmt.setString(2, sParaPasswd);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				++iCnt;
			}

			rs.close();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		if(iCnt >= 1) return true;
		else return false;
	}
}

