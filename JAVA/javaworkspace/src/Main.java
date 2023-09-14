package acorn_project.second_project;
import java.sql.*;
import java.util.Scanner;

public class StockInfoAdmin {
    Scanner sc = new Scanner(System.in);
    private String rawmaterialCode;
    private int rawmaterialQty;
    private static String DB_URL
            = "jdbc:oracle:thin:@localhost:1521:xe";
    private static String USER = "black";
    private static String PASS = "black";
    public StockInfoAdmin() throws SQLException {
//        Connection conn = null;
//        PreparedStatement pstmt = null;
//        int rs = 0;
//        String sqlUpdate = "update stockinfo set rawmaterialqty = ? where stockid between ? and ? ";
//
//        int rawmaterialqty = sc.nextInt();
//        int stockid = sc.nextInt();
//        pstmt = conn.prepareStatement(sqlUpdate);
//        pstmt.setInt(1, rawmaterialqty);
//        pstmt.setInt(2, stockid);
//        pstmt.setInt(3, stockid);
//        rs = pstmt.executeUpdate();
//        System.out.println(rs);
    }

    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            //접속
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            //변경문구 작성
//            String sqlSelect = "Select * from stockinfo";
            String sqlUpdate = "update stockinfo set rawmaterialqty = ? where stockid between ? and ? ";
//            String sqlUpdate2 = "update stockinfo set rawmaterialqty = 10 where stockid between 1 and 5 ";
            System.out.println("재고수량을 입력해주세요");
            String rawmaterialqty = sc.nextLine();
            System.out.println("처음번호를 입력해주세요 ");
            String stockid1 = sc.nextLine();
            System.out.println("끝번호를 입력해주세요 ");
            String stockid2 = sc.nextLine();
            pstmt = conn.prepareStatement(sqlUpdate);
            pstmt.setInt(1, Integer.valueOf(rawmaterialqty));
            pstmt.setInt(2, Integer.valueOf(stockid1));
            pstmt.setInt(3, Integer.valueOf(stockid2));
            System.out.println(100);
            int iRet = pstmt.executeUpdate();
            System.out.println(200);
            System.out.println(iRet);
            System.out.println(300);

            sc.close();
        }
        catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public StockInfoAdmin(String rawmaterialCode, int rawmaterialQty){
        this.rawmaterialCode = rawmaterialCode;
        this.rawmaterialQty = rawmaterialQty;
    }
    public String getRawmaterialCode() {
        return rawmaterialCode;
    }
    public void setRawmaterialCode(String rawmaterialCode) {
        this.rawmaterialCode = rawmaterialCode;
    }
    public int getRawmaterialQty() {
        return rawmaterialQty;
    }
    public void setRawmaterialQty(int rawmaterialQty) {
        this.rawmaterialQty = rawmaterialQty;
    }
}


}