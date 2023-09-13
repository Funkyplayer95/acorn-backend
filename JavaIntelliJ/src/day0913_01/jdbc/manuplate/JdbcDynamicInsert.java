package day0913_01.jdbc.manuplate;

import java.sql.*;

public class JdbcDynamicInsert {
    private static String DB_URL
            = "jdbc:oracle:thin:@localhost:1521:xe";
    private static String USER = "black";
    private static String PASS = "black";

    public static void main(String[] args) {
        //데이터베이스 연결
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            // 연결 설정
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            // 구문객체 생성
            String sqlInsert = "insert into stockinfo(rawmaterialcode,rawmaterialqty)" +
                    "values(?, ?)";
            String rawmatcode = "342345";
            int qty = 200;
            pstmt = conn.prepareStatement(sqlInsert);
            pstmt.setString(1,rawmatcode);
            pstmt.setInt(2,qty);
            int iRet = pstmt.executeUpdate();

            String sqlSelect = "select rawmaterialcode,rawmaterialqty " +
                    "from stockinfo WHERE rawmaterialcode = ?";

            if(iRet >= 1){
            pstmt = conn.prepareStatement(sqlSelect);
            pstmt.setString(1, rawmatcode);
            rs = pstmt.executeQuery();
                while (rs.next()){
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
