package com.acorn;

import java.util.Scanner;

public class Study02 {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("국어점수 : >>>");
//		int klpoint = sc.nextInt();
//		System.out.println("영어점수 : >>>");
//		int elpoint = sc.nextInt();
//		System.out.println("수학점수 : >>>");
//		int mlpoint = sc.nextInt();
//		
//		System.out.println("전체 점수의 합: " + (klpoint+elpoint+mlpoint));
//		
//		sc.close();
		
		// 과목별 과락 점수를 지정
		// 임의의 과목 3개에 대해 각각의 점수를 입력받는다.
		// 모든 점수를 합산
		// 모든 점수의 평균을 구한다.
		// 합산 점수의 합격 / 불합격 여부 결정
		// 평균 점수의 합격 / 불합격 여부 결정
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a 과목 점수?");
		int a = sc.nextInt();
		System.out.print("b 과목 점수?");
		int b = sc.nextInt();
		System.out.print("c 과목 점수?");
		int c = sc.nextInt();
		
		if(a < 60 || b < 60 || c < 60){
			System.out.println("점수 미달입니다.");
			if (a < 60) {
				System.out.println("a과목 점수 미달 입니다.");
			}
			if (b < 60) {
				System.out.println("b과목 점수 미달 입니다.");
			}
			if (c < 60) {
				System.out.println("c과목 점수 미달 입니다.");
			}

		}
		
		else {
			int d = a + b + c;
			// int 형은 %d %f %s
			double e = d / 3.0;
			System.out.println("전체 점수의 합은 : " + d);
			System.out.printf("전체 점수의 평균은 : %.2f \n" , e);
			
			if(d > 200 && e > 65) {
				System.out.println("합산,평균 점수 : 합격 입니다!!");
			}
			else {
				System.out.println("합산,평균 점수 : 불합격 입니다.");
			}
		}
		
		
		
		sc.close();
		
		
		
		
		
		
		
		
		
	}

}
