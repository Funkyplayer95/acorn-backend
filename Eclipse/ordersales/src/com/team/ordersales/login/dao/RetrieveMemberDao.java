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
			"jdbc:oracle:thin:@192.168.0.123:1521:xe";
			private final static String USER = "team1";
			private final static String PASS = "team1";
	
	public static List<LoginUserEntity> 
			getMemberList(String id) {
		List<LoginUserEntity> llist = new ArrayList<LoginUserEntity>();
		LoginUserEntity le = null;
		
		String sqlRole = "SELECT role FROM userinfo "
				+ "WHERE id = ?";
		String sqlUserRole = "SELECT id, passwd, phonenum, role, addr FROM userinfo "
				+ "WHERE role = 'u'";
		String sqlAdminRole = "SELECT id, passwd, phonenum, role, addr FROM userinfo";
		
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
			
			// 사용자와 관리자가 로그인 했을때 명단 나오게끔 하는 코드
			if((role.equals("a")) /*|| (role.equals("u"))*/) {
				pstmt = conn.prepareStatement(sqlAdminRole);
				rs = pstmt.executeQuery();
			} 
			else if(role.equals("u")){
				pstmt = conn.prepareStatement(sqlUserRole);	
				rs = pstmt.executeQuery();
			}
			
			while(rs.next()) {
				le = new LoginUserEntity(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
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





