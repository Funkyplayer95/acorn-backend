package day0818_01;

import java.util.Scanner;

public class Backjoon_25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();
        int total = 0;


        for (int i = 0;i < N;i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int num = a*b;
            total += num;
        }
        if (X == total)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }


            sc.close();
        }
    }
