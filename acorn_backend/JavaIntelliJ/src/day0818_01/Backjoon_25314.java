package day0818_01;

import java.util.Scanner;

public class Backjoon_25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if(N >= 4 && N%4==0){
            String L = "long ";

            for (int i =0; i<N/4; i++)
            {
                System.out.print(L);
            }
            System.out.println("int");
        }

        sc.close();
    }
}
