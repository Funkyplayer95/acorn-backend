package acorn_project.second_project;

import java.sql.*;
import java.util.Scanner;

public class StockInfoAdmin {

    //접속 DB_URL,USER,PASS 입력
    private static String DB_URL
            = "jdbc:oracle:thin:@192.168.0.71:1521:xe";
    private static String USER = "project";
    private static String PASS = "ljuneh";

    public StockInfoAdmin() {
    }

    //첫시작 재고를 채우는 <함수>
    public void StockInitAdmin() throws SQLException {

        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            //접속
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            //재고가 0이라는 가정하에, 재고량을 50으로 수정
            String sqlUpdate = "update stockinfo set rawmaterialqty = 50 where rawmaterialcode 11111 ";

            //동적사용 명령창 실행 및 값 입력
            pstmt = conn.prepareStatement(sqlUpdate);

            //int 변수에 값 저장하여 출력
            int iRet = pstmt.executeUpdate();
            System.out.println(iRet);

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    //주문 후 비어있는 재고를 채우거나 수정해야 할 시 사용될 <함수>
    public void StockInfoAdmin() throws SQLException {

        // Main문에 Scanner 있을 시 지워서 진행.
        Scanner sc = new Scanner(System.in);

        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            //접속
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            //변경문구 작성 (사용 방법에 따라 between 또는 개별로 진행하기. 예시는 between 으로)
            String sqlUpdate = "update stockinfo set rawmaterialqty = ? where rawmaterialcode = ? ";

            //변동된 재고수량 입력하는 명령창
            System.out.println("재고수량을 입력해주세요");
            String rawmaterialqty = sc.nextLine();

            // between을 사용할 경우 시작 stockid값 입력 , 개별로 수정시 원하는 stockid값 입력
            System.out.println("번호를 입력해주세요 ");
            String rawmaterialcode = sc.nextLine();

            //동적사용 명령창 실행 및 값 입력
            pstmt = conn.prepareStatement(sqlUpdate);

            //String으로 받아서 Integer로 변환하여 값받기
            pstmt.setInt(1, Integer.valueOf(rawmaterialqty));
            pstmt.setInt(2, Integer.valueOf(rawmaterialcode));

            //int 변수에 값 저장하여 출력
            int iRet = pstmt.executeUpdate();
            System.out.println(iRet);

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    //주문 후 재고가 변동으로 -1 바꿀때 쓰는 함수
    public void AfterOrder() throws SQLException {

        // Main문에 Scanner 있을 시 지워서 진행.
        Scanner sc = new Scanner(System.in);
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            //접속
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            //ID를 입력받아 재고량을 조회한다.
            System.out.println("조회하고싶은 Code를 입력하시오");
            String sqlSelect = "select rawmaterialqty from stockinfo where rawmaterialcode = ?";
            String check = sc.nextLine();

            //동적사용 명령창 실행 및 값 입력
            pstmt = conn.prepareStatement(sqlSelect);
            pstmt.setInt(1, Integer.valueOf(check));

            // 결과값 저장할 변수 rs
            rs = pstmt.executeQuery();

            // Update실행시 필요한 변수 초기화 진행
            int iRet = 0;

            while (rs.next()) {
                // 조회한 재고량 출력
                System.out.println(rs.getString(1));

                // 주문 후 -1이 될 ID를 입력 받기.
                System.out.println("-1할 Code를 입력해주세요");
                String check2 = sc.nextLine();

                // -1 할 Update 실행 문구
                String sqlUpdate = "update stockinfo set rawmaterialqty = " + rs.getString(1) + "-1 where rawmaterialcode = ? ";
                pstmt = conn.prepareStatement(sqlUpdate);
                pstmt.setInt(1, Integer.valueOf(check2));

                // 재고량에 -1 을하여 값을 iRet에 저장
                iRet = pstmt.executeUpdate();

                // iRet이 작동시 나올 문구와 현 재고량 표현
                if (iRet >= 1) {
                    System.out.println("재고가 -1만큼 줄었습니다.");
                    System.out.println("현 재고량 : " + (Integer.valueOf(rs.getString(1)) - 1));
                }
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void selectStockInfo() {
        System.out.println("재고 정보를 조회합니다.");
        String selectStock = "select * from stockinfo";
    }
}

