package day0816_01;

import java.util.Scanner;

public class Backjoon_2884 { // 알람시계문제  - 내가 원하는 시간보다 45분 전에 알람이 울리도록
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 시간과 분을 입력받는다
        int H = sc.nextInt();
        int M = sc.nextInt();
        //분의 값이 45보다 작으면 시간 값이 변해야 하기 때문에 조건문을 실행.
        if (M < 45) {
            H--; // 45보다 작으면 시간을 1뺀다
            M = 60 - (45 - M); // 45보다 작을때 적용될 분의 값을 구하는 식
            if (H < 0) { // 45보다 작을때 시간이 0보다 작아진다면 23으로 바꿔야하니까
                H = 23;
            }
            System.out.println(H + " " + M);
        } else { // 45분보다 크다면 M의 값에서 뺴버리면 그만이다.
            System.out.println(H + " " + (M - 45));
        }
    }
}
