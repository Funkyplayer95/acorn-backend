package com.acorn.jdbc.manuplate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcDynamicInsert {
	private static String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String USER = "kht123";
	private static String PASS = "kht123";
	
	public static void main(String[] args) {
		// 데이터베이스 객체
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			// 연결 설정
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			// 구문객체 생성
			String sqlInsert = "INSERT INTO stockInfo(rawmaterialname, rawmaterialqty) "
					+ "Values(?, ?)";
			String rawmatcode = "342345";
			int qty = 200;
			pstmt = conn.prepareStatement(sqlInsert);
			pstmt.setString(1, rawmatcode);
			pstmt.setInt(2, qty);
			int iRet = pstmt.executeUpdate();

			String sqlSelect = "SELECT rawmaterialname, rawmaterialqty "
					+ "FROM stockInfo WHERE rawmaterialname = ?";
			if(iRet >= 1) {
				pstmt = conn.prepareStatement(sqlSelect);
				pstmt.setString(1, rawmatcode);
				rs = pstmt.executeQuery();			
				while(rs.next()) {
					System.out.print(rs.getString(1) + " ");
					System.out.println(rs.getString(2));
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
