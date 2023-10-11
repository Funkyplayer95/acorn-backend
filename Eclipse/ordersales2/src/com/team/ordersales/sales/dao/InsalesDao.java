package com.team.ordersales.sales.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.team.ordersales.order.dto.IdentifyInsalesDto;

public class InsalesDao {
	
	private final static String DB_URL =
			"jdbc:oracle:thin:@192.168.0.123:1521:xe";
	private final static String USER = "team1";
	private final static String PASS = "team1";
	
//	public final static String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";
//	public final static String USER = "myoracle";
//	public final static String PASS = "1234";

	
	public InsalesDao() {}
	
	public static List<IdentifyInsalesDto> getsaleList(){
		List<IdentifyInsalesDto> oList = new ArrayList<IdentifyInsalesDto>();
		IdentifyInsalesDto iid = null;
		
		String sqlSale = "SELECT GOODSCODE, GOODSNAME, RAWMATERIALCODE, RAWMATERIALQTY, INSALES\r\n"
				+ "from ORDERGOODS order by GOODSCODE desc";
//		String sqlInsale = "SELECT GOODSCODE, GOODSNAME, RAWMATERIALCODE, RAWMATERIALQUANTITY, INSALES\r\n"
//				+ "from ORDERGOODS\r\n"
//				+ "where INSALES = ?";			/*검색시- n인가 y인가.?*/
		
		Connection conn 		= null;
		PreparedStatement pstmt = null;
		ResultSet rs 			= null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			pstmt = conn.prepareStatement(sqlSale);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				iid = new IdentifyInsalesDto();
				
				iid.setGOODSCODE(rs.getString("GOODSCODE"));
				iid.setGOODSNAME(rs.getString("GOODSNAME"));
				iid.setINSALES(rs.getString("INSALES"));
				iid.setRAWMATERIALCODE(rs.getString("RAWMATERIALCODE"));
				iid.setRAWMATERIALQTY(rs.getInt("RAWMATERIALQTY"));
				
				oList.add(iid);
				
			}
			
			rs.close();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	 return oList;
	}
}
