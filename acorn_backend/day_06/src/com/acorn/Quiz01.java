package com.acorn;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어점수를 입력하시오 : ");
		int x = sc.nextInt();
		System.out.println("수학점수를 입력하시오 : ");
		int y = sc.nextInt();
		System.out.println("영어점수를 입력하시오 : ");
		int z = sc.nextInt();
		
		if(x >= 40 && y >=40 && z >=40)
		{
			if((x + y + z) / 3 >=60)
			{
				System.out.println("국어점수 : " + x);
				System.out.println("수학점수 : " + y);
				System.out.println("영어점수 : " + z);
				System.out.println("합계 : " + (x+y+z));
				System.out.println("평균 : " + ((x+y+z)/3));
				System.out.println("축하합니다 합격입니다");
			}
			else
			{
				System.out.println("평균점수 불합격 입니다.");
			}
		}
		else
		{
			System.out.println("불합격 입니다.");
		}
		
		sc.close();

	}

}
