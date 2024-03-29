package com.team.ordersales.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.team.ordersales.login.dto.RegisMemDto;

public class RegisMemDao {
	
	private final static String DB_URL =
			"jdbc:oracle:thin:@localhost:1521:xe";
	private final static String USER = "kht123";
	private final static String PASS = "kht123";
	
	public static boolean registerMember(RegisMemDto regisMemDto) {
		int iICount = 0;
			
		String sqlIns = "INSERT INTO loginuser(id, passwd, role, addr) "
				+ "VALUES(?, ?, ?, ?)";
		
		Connection conn 		= null;
		PreparedStatement pstmt = null;
			
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		try {
			conn = 
				DriverManager.getConnection(DB_URL, USER, PASS);
			
			pstmt = conn.prepareStatement(sqlIns);
			pstmt.setString(1, regisMemDto.getId());
			pstmt.setString(2, regisMemDto.getPasswd());
			pstmt.setString(3, regisMemDto.getRole());
			pstmt.setString(4, regisMemDto.getAddr());
				
			iICount = pstmt.executeUpdate();
			conn.commit();				
			
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
			
		if(iICount == 1) return true;
		else return false;
	}
}

