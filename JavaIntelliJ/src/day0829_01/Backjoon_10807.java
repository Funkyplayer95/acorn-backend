package day0829_01;

import java.util.Scanner;

public class Backjoon_10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int count = 0;
        int[] iArr = new int[N];

        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = sc.nextInt();
        }

        int V = sc.nextInt();

        for (int i = 0; i < iArr.length; i++) {
            if (V == iArr[i]){
                count++;
            }
        }

        System.out.println(count);

    }
}
