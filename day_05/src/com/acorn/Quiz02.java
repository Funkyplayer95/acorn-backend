package com.acorn;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String x ,y;
		int z;
		
		
		System.out.println("이름을 입력하세요");
		x = sc.nextLine();
		System.out.println("성별을 입력하세요 (남성/여성)");
		y = sc.nextLine();
		System.out.println("나이를 입력하세요");
		z = sc.nextInt();
		System.out.println(z + "살 " + y + " " + x + "님, 만나서 반갑습니다");
		
	
		
		
		
		sc.close();

	}

}
