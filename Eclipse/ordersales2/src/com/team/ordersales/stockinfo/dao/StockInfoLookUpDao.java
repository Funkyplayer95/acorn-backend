package com.team.ordersales.stockinfo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.team.ordersales.comm.ConfigureImpl;
import com.team.ordersales.stockinfo.entity.StockInfoEntity;

public class StockInfoLookUpDao {
	// 쿼리문 - 재고 테이블이랑 정보 테이블에서 이름과 수량을 뽑아오는 명령문. 조회창에 이름 - 수량 으로 나올 수 있게
	private static String QUERY1 = "select r.rawmaterialname, o.rawmaterialqty\r\n"
			+ "from rawmaterial r, stockinfo o \r\n" + "where r.rawmaterialcode= o.rawmaterialcode";

//	public StockInfoLookUpDao (StockInfoEntity stockInfoEntity, ResultSet rs) throws SQLException {
//		stockInfoEntity = new StockInfoEntity();
//		PreparedStatement pstmt = conn.prepareStatement("select * from stockinfo");
//		rs = pstmt.executeQuery();
//		while(rs.next()) {
//			String siCode = rs.getString("rawmaterialname");
//			String siQty = rs.getNString("rawMaterialQuantity");
//		}
//		}
//	}

	public static ArrayList<StockInfoEntity> getStockInfoList() throws SQLException {
//		System.out.println(5);
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.out.println(6);
		Statement stmt = null;
//		System.out.println(7);
		Connection conn = ConfigureImpl.getConnObject();

//		System.out.println(conn);
//		System.out.println(8);
		stmt = conn.createStatement();
//		System.out.println(9);
		ResultSet rs = null;
//		System.out.println(10);

		ArrayList<StockInfoEntity> silist = new ArrayList<StockInfoEntity>();
		StockInfoEntity le = null;

//		System.out.println(11);

		rs = stmt.executeQuery(QUERY1);
		while (rs.next()) {
			String siCode = rs.getString("rawmaterialname");
			String siQty = rs.getString("rawmaterialqty");

			le = new StockInfoEntity(siCode, siQty);
			silist.add(le);
		}
//		System.out.println(12);
		rs.close();
		stmt.close();
		// conn.close();

		return silist;
	}

}
