package day0816_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //회사에는 창고가 있음. 창고에 여러 상품이 있으며, 각각의 상품들은 존으로 나뉘어진 구역에 정리 되어있음.
        //작업자는 해당존을 보고, 상품(4종류)이 비어있으면 제조업체에 연락, 부족한 상품 주문
        //해당 업체는 주문량에 맞는 상품을 싣고 해당 창고로 차로 배송.
        //배송차가 창고에 도착하면, 창고담당자의 검수 후 해당존에 상품을 두고 영수증을 받고 돌아감.
        Scanner sc = new Scanner(System.in);
        //창고 존은 0으로 초기화
        int oneZone;
        int twoZone;
        int threeZone;
        int fourZone;
        //회사창고 라는 배열안에 해당 존이 있음
//        int[] companyCargo = {oneZone, twoZone, threeZone, fourZone};

        //현재 재고량의 값은 키보드로 받는다.
        System.out.println("oneZone에 있을 재고량을 입력하시오.");
        oneZone = sc.nextInt();
        System.out.println("twoZone에 있을 재고량을 입력하시오.");
        twoZone = sc.nextInt();
        System.out.println("threeZone에 있을 재고량을 입력하시오.");
        threeZone = sc.nextInt();
        System.out.println("fourZone에 있을 재고량을 입력하시오.");
        fourZone = sc.nextInt();

        // 적정 재고의 량을 지정
        int fullZone = 10;

        //반복문을 돌려 자동으로 채울 수 있도록
        for (int i = 0; i < 10; i++) {
            //재고량이 full에 비해 부족하다면 채우는 명령을 입력.
            System.out.println("현재 재고량은 : " + oneZone + ":" + twoZone + ":" + threeZone + ":" + fourZone);

            if (oneZone < fullZone) {
                oneZone += fullZone - oneZone;
                //해당 재고가 채워지고 있는지 확인
            } else if (twoZone < fullZone) {
                twoZone += fullZone - twoZone;
            } else if (threeZone < fullZone) {
                threeZone += fullZone - threeZone;
            } else if (fourZone < fullZone) {
                fourZone += fullZone - fourZone;
            } else {
                System.out.println("모든 재고가 가득합니다.");
                break;
            }
            System.out.println("press any key to continue");
            sc.next();
        }
        sc.close();
    }
}
