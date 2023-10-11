package day0818_01;

import java.util.Scanner;

public class Backjoon_2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if (A == B && B == C)
        {
            System.out.println( 10000 + (A * 1000) );
        }
        else if( A == B || B == C || C == A)
        {
            if (A==B)
            {System.out.println(1000 + (A * 100));}
            else if (C==B)
            {System.out.println(1000 + (B * 100));}
            else
            {System.out.println(1000 + (C * 100));}
        }
        else
        {
            System.out.println(Math.max((Math.max(A,B)),C) * 100);
        }

        sc.close();
    }
}
