package com.acorn;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int x = sc.nextInt();
		
		if(x>0)
		{
			System.out.println(x + "는 양수 입니다.");
		}
		else
		{
			System.out.println(x + "는 양수가 아닙니다.");
		}
		
		
		sc.close();

	}

}
