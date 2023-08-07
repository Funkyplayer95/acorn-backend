package com.acorn;

import java.util.Scanner;

public class Quiz2_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("0~6 사이의 숫자를 입력하여 날짜를 알아보세요 : ");
		int x = sc.nextInt();
		String[] Day = {"월","화","수","목","금","토","일"};
		
		if(x>=0 && x<7)
		{
			System.out.println(Day[x]);
		}
		else
		{
			System.out.println("잘못 입력하였습니다.");
		}
		
		
		
		sc.close();
	}

}
