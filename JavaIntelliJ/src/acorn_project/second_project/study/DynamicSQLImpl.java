package acorn_project.second_project.study;

import java.sql.*;
import java.util.Scanner;

public class DynamicSQLImpl implements Configure{
    public static void main(String[] args) throws SQLException {
        Connection conn;
        //데이터베이스 접속
        conn = DriverManager.getConnection(DB_STring,USER,PASS);
        Scanner sc = new Scanner(System.in); // 키보드
        System.out.println("입력 : ");
        String sValue = sc.nextLine();
//        System.out.println(Integer.valueOf(sValue));


        //질의어(문자열) 전달
        PreparedStatement pstmt = conn.prepareStatement("select userid, userpassword, role From userinfo where userid = ?");
        pstmt.setString(1,sValue);
        ResultSet rs = pstmt.executeQuery();

        while(rs.next()){
            String sUserid = rs.getString("userid");
            String sUserPassword = rs.getString("userpassword");
            String sRole = rs.getString("Role");
            String userInfo = sUserid + " : " + sUserPassword +  " : " + sRole ;
            System.out.println(userInfo);
        }

        conn.close();

    }
}


