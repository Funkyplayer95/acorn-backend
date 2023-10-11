package com.acorn;

import java.util.Scanner;

public class Run3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자를 입력하세요 : ");
		String w = sc.nextLine();
		
		
		System.out.println("첫 번째 문자 : " + w.substring(0,1));
		System.out.println("두 번째 문자 : " + w.substring(1,2));
		System.out.println("세 번째 문자 : " + w.substring(2,3));
		
		
		
		sc.close();
	}

}
