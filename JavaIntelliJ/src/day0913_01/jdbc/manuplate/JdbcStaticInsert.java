package day0913_01.jdbc.manuplate;

import java.sql.*;

public class JdbcStaticInsert {
    private static String DB_URL
            = "jdbc:oracle:thin:@localhost:1521:xe";
    private static String USER = "black";
    private static String PASS = "black";

    public static void main(String[] args) {
        //데이터베이스 연결
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            // 연결 설정
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            // 구문객체 생성
            stmt = conn.createStatement();
            // 재고 정보 테이블에 행 입력
            // UPDATE 테이블명 SET 컬럼명=값, .... WHERE 컬럼명=값
            // DELETE FROM 테이블명 WHERE 컬럼=값
            String sqlInsert = "insert into stockinfo(rawmaterialcode,rawmaterialqty) values('123456',50)";
            String sqlSelect = "select rawmaterialcode,rawmaterialqty from stockinfo";
            int iRet = stmt.executeUpdate(sqlInsert); // 입력한 행 수
            if(iRet >= 1){
                rs = stmt.executeQuery(sqlSelect);
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
