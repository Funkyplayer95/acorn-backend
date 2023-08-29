package day0829_01;

import java.util.Scanner;

public class Backjoon_10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int X = sc.nextInt();
        int[] Arr = new int[A];

        for (int i = 0; i < A; i++) {
            Arr[i] = sc.nextInt();
        }
        for (int i = 0; i < A; i++) {
            if(Arr[i] < X){
                System.out.print(Arr[i] + " ");
            }
        }
    }
}
