package day0818_01;

import java.util.Scanner;

public class Backjoon_8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n > 0) {
            int num = 0;
            for (int i = 1; i < (n + 1); i++) {
                num += i;
            }
            System.out.println(num);
        }
        sc.close();
    }
}
