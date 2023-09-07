package day0907_01;

import java.util.Arrays;
import java.util.Scanner;

public class Pratice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int customerRoom = 105;
        System.out.println("방 바꾸시겠어요? (y/n)");
        String customer = sc.next();

        if (customer.equalsIgnoreCase("y")) {
            chageRoom(customerRoom,sc);
        }
        else {
            System.out.println("알겠습니다. 좋은하루 보내세요");
        }
    }

    public static void chageRoom(int customerRoom,Scanner sc) {
        String[] roomNum = new String[4];

// 배열값넣기
        roomNum[0] = "nomal";
        roomNum[1] = "double";
        roomNum[2] = "sweet";
        roomNum[3] = "vip";

        System.out.println("남은 방을 보여드리겠습니다.");
        for (int i = 0; i < roomNum.length; i++) {
            System.out.println((i+1) +" 번 방은"+roomNum[i]);
        }
        System.out.println("바꾸시고 싶으신 방번호를 입력해주세요.");
        int num = sc.nextInt();
        if(num == 1){
            System.out.println("고객님의 방이 " + customerRoom + " 에서 " + roomNum[0]+ " 으로 변경되었습니다.");
        }
        else if (num ==2){
            System.out.println("고객님의 방이 " + customerRoom + " 에서 " + roomNum[1]+ " 으로 변경되었습니다.");
        }
        else if (num ==3){
            System.out.println("고객님의 방이 " + customerRoom + " 에서 " + roomNum[2]+ " 으로 변경되었습니다.");
        }
        else if (num ==4){
            System.out.println("고객님의 방이 " + customerRoom + " 에서 " + roomNum[3]+ " 으로 변경되었습니다.");
        }


        System.out.println("방이 변경 완료되었습니다");
    }
}
