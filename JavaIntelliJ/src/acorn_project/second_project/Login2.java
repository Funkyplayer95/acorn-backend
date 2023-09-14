package acorn_project.second_project;

import java.util.Scanner;

public class Login2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //스캐너로 문장을 받아 입력
        System.out.println("로그인을 해주세요");
        System.out.println("일반 유저 로그인 : U ");
        System.out.println("관리자 유저 로그인 : A ");
        String logincheck = sc.next();

        //일반 유저로 로그인 할 경우
        if(logincheck.equalsIgnoreCase("u"))
        {
            System.out.println("반갑습니다. 주문할 상품을 선택해주세요.");
            //주문 상품 배열 또는 리스트 함수 입력
            System.out.println();
        }

        //관리자로 로그인 할 경우
        else if(logincheck.equalsIgnoreCase("a"))
        {
            System.out.println("반갑습니다. 관리자 메뉴를 선택해주세요.");
            System.out.println("1. 상품정보");
            System.out.println("2. 판매정보 확인");
            System.out.println("3. 재고관리");

            int admincheck = sc.nextInt();
            if (admincheck == 1){
                System.out.println("1. 상품 보기");
                System.out.println("2. 상품 변경");
                int goods = sc.nextInt();
                if (goods ==1 ){
                    //상품보기 창 출력
                } else if (goods ==2) {
                    //상품변경 창 출력
                }else {
                    System.out.println("잘못된 선택입니다.");
//                    break;
                }
            }
            else if (admincheck == 2){
                //판매정보 확인창 출력
                System.out.println("");
            }
            else if (admincheck == 3){
                //재고관리 출력
            }
        }

    }
}
