package acorn_project.second_project.study;

import java.sql.*;

public class StaticSQLImpl implements Configure{
    public static void main(String[] args) throws SQLException {
        Connection conn;
        //데이터베이스 접속
        conn = DriverManager.getConnection(DB_STring,USER,PASS);
        String sIUserrid = "user";
        String sIUserpassword = "user";
        //질의어(문자열) 전달
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select userid, userpassword, role From userinfo " + "where userid = '" + sIUserrid + "'");

        while(rs.next()){
            String sUserrid = rs.getString("userid");
            String sUserpassword = rs.getString("userpassword");
            String sRole = rs.getString("role");
            String userInfo = sUserrid + " : " + sUserpassword + " : " + sRole;
            System.out.println(userInfo);
        }
        rs.close();
        stmt.close();
        conn.close();

    }
}


