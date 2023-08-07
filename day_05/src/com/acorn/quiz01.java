package com.acorn;

import java.util.Scanner;

public class quiz01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하시오");
		int x = sc.nextInt();
		
		for(int i = x; i > 0; i--) { // i=x로 값을 주고 i값을 -1하여 출력하는 방식
			System.out.print(i + " ");
		}
		System.out.println();
		
		for(int i = 0; i < x; i++) { // i=0으로 값을 주고 i가 x보다 작으면 +하여 x-i로 깎아내려 출력하는 방식
			System.out.print((x-i) + " ");
		}
		
		System.out.println();
		
		for(int i =0 ; i < x; i ++) // i=0으로 값을 주고 i가 x보다 작으면 오름차순으로 나오게 출력하는 방식
		{
			System.out.print((i+1) + " ");
		}
		
		System.out.println();
		
		for(int i =x ; i >0 ; i--) // i=x로 값을 주고 i가 0보다 크면 i를 -하여 오름차순으로 출력하는 방식
		{
			System.out.print((x - i +1) + " ");
		}
		
		sc.close();

	}

}
