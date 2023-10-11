package com.acorn;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("이름을 입력하세요 : ");
		String a = sc.nextLine();
		System.out.print("성별을 입력하세요(남/여) : ");
		String b = sc.nextLine();
		System.out.print("나이를 입력하세요 : ");
		int c = sc.nextInt();
		System.out.print("키를 입력하세요 (소수점 가능) : ");
		double d = sc.nextDouble();
		System.out.println("키 " + d + "인 " + c + "살 " + b + "자 " + a + "님 반갑습니다^^");
		
		
		sc.close();
	}

}
