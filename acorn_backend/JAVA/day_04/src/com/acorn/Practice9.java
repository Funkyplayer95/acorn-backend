package com.acorn;

import java.util.Scanner;

public class Practice9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//값 입력 예제
		System.out.println("중간고사 점수를 입력하세요 : ");
		int a = sc.nextInt(); // 중간고사점수 
		System.out.println("기말고사 점수를 입력하세요 : ");
		int b = sc.nextInt(); // 기말고사 점수
		System.out.println("과제점수를 입력하세요 : ");
		int c = sc.nextInt();// 과제점수
		System.out.println("출석 횟수를 입력하세요 : ");
		int d = sc.nextInt(); // 출석 횟수
		
		
		int all_d = 20; // 총 출석 일
		
		float d_av =  (d/all_d) * 100 ; // 출석 비율
		
		double result = ((a*0.2) + (b*0.3) + (c*0.3) + (d/20*0.2)); // 결과값 2:3:3:2
		
		
	
		if(result >= 70) // 결과값이 70 이상이고 출석일수가 30%초과면
		{
			if (d_av <= 30) // 출석일수가 30%이하면
			{
				System.out.println("출석일수가 부족하여 fail 입니다.");
			}
			else
			{
				System.out.println("축하합니다 PASS입니다");
			}
		}
		else {
			System.out.println("저런.. Fail입니다");
		}
			
					
			
		
		
		
		
		
		
		
		
		
		sc.close();

		
	}

}
