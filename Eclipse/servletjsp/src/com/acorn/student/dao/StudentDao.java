package com.acorn.student.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.acorn.student.entity.StudentEntity;

public class StudentDao {

	private final static String DB_URL =
			"jdbc:oracle:thin:@localhost:1521:xe";
	private final static String USER = "black";
	private final static String PASS = "black";
	
	public static List<StudentEntity> getStudents() {
		
		List<StudentEntity> students = 
				new ArrayList<StudentEntity>();
		StudentEntity student = null;
		
		String sql = "SELECT firstname, lastname, address "
				+ "FROM studentinfo";
		
		Connection conn 		= null;
		PreparedStatement pstmt = null;
		ResultSet rs 			= null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		
		try {
			
			conn = 
					DriverManager.getConnection(DB_URL, USER, PASS);
			pstmt = conn.prepareStatement(sql);			
			rs = pstmt.executeQuery();
						
			while(rs.next()) {
				student = new StudentEntity();
				student.setsFirstName(rs.getString("firstname"));
				System.out.println(rs.getString("firstname"));
				student.setsLastName(rs.getString("lastname"));
				student.setsAddress(rs.getString("address"));
				students.add(student);
			}
			
			rs.close();
			pstmt.close();
			conn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		return students;
	}
}
