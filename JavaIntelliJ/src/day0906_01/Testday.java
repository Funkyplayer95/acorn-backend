package day0906_01;

import java.util.Scanner;

public class Testday {
      /*main() {
            입력(고객번호 or 고객명)
            int type = CheckBlackListCustomer(고객번호 or 고객명)
        }

        정수(고객타입1/2) CheckBlackListCustomer(고객명) {
            불량 고객 리스트;
            포함되어야 있는지 확인
        }*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("고객코드를 입력해주세요");
        int Customer = sc.nextInt();
        int Customer2 = sc.nextInt();
        boolean cType =CheckBlackListCustomer(Customer); // 변수를 지정하여 함수의 값을 저장하는 공간을 만든다.
        if (cType == true) {
            System.out.println("이 사람은 블랙리스트 사람입니다.");
        } else {
            System.out.println("평범한 고객님 입니다.");
        }
    }


    public static boolean CheckBlackListCustomer(int Customer) {
        int[] blackListCustomer = {11, 22, 33, 44, 55};
        boolean blackListHuman = false;
        for (int i : blackListCustomer) {
            if(i == Customer) {

                blackListHuman = true;
                break;
            }
        }
        return blackListHuman;
    }

    public  static void sendYourCall(Scanner sc){

        while(true){
            System.out.println("메세지 업무를 선택하셨습니다.");
            System.out.println("확인하고 싶은 메뉴를 선택해주세요.");
            System.out.println("1.우편");
            System.out.println("2.음성메세지");
            System.out.println("3.FAX");
            System.out.println("4.택배");
            int check = sc.nextInt();

            if(check == 1){
                System.out.println();
            }

        }

    }
}






