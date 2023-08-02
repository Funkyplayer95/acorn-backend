package com.acorn;

import java.util.Scanner;

public class Run4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("인원 수를 정하세요 : ");
		System.out.println("사탕 개수를 정하세요 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
				
		System.out.println("1인당 사탕 개수 : " + (b/a));
		System.out.println("남은 사탕 개수 : " + (b%a));
		
		
		sc.close();
		

	}

}
