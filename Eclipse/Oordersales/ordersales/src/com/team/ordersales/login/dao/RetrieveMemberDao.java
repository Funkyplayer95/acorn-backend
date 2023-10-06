package com.team.ordersales.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.team.ordersales.login.entity.LoginUserEntity;

public class RetrieveMemberDao {
	private final static String DB_URL =
			"jdbc:oracle:thin:@localhost:1521:xe";
			private final static String USER = "kht123";
			private final static String PASS = "kht123";
	
	public static List<LoginUserEntity> 
			getMemberList(String id) {
		List<LoginUserEntity> llist = new ArrayList<LoginUserEntity>();
		LoginUserEntity le = null;
		
		String sqlRole = "SELECT role FROM loginuser "
				+ "WHERE id = ?";
		String sqlUserRole = "SELECT id, passwd, role, addr FROM loginuser "
				+ "WHERE id = ?";
		String sqlAdminRole = "SELECT id, passwd, role, addr FROM loginuser";
		
		Connection conn 		= null;
		PreparedStatement pstmt = null;
		ResultSet rs 			= null;
		String role 			= null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}	
		try {
			conn = 
				DriverManager.getConnection(DB_URL, USER, PASS);
			pstmt = conn.prepareStatement(sqlRole);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();

			while(rs.next()) {
				role = rs.getString("role");
			}	
			
			if(role.equals("admin")) {
				pstmt = conn.prepareStatement(sqlAdminRole);
				rs = pstmt.executeQuery();
			} else {
				pstmt = conn.prepareStatement(sqlUserRole);
				pstmt.setString(1, id);	
				rs = pstmt.executeQuery();
			}

			
			while(rs.next()) {
				le = new LoginUserEntity(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
				llist.add(le);
			}
			
			rs.close();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}


		return llist;
	}
			
}





