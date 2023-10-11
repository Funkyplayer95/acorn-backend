package com.acorn;

import java.util.Scanner;

public class Study02teacher {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("국어점수:>>>");
//		int nlpoint = sc.nextInt();
//		System.out.println("영어점수:>>>");
//		int elpoint = sc.nextInt();
//		System.out.println("수학점수:>>>");
//		int matlpoint = sc.nextInt();
//		
//		System.out.println("전체 점수의 합:" + (nlpoint + elpoint + matlpoint));
		
		// 과목별 과락(별) 점수를 지정
		int iSumpDropPoint = 160;
		int iAvgDropPoint = 60;
		int idropMarginPoint = 60;
		// 합산/평균 점수 저장
		int iAvgPoint = 0;
		// 임의의 과목 3개에 대해 각각의 점수를 입력받는다.
		System.out.println("A과목:>>>");
		int iAPoint = sc.nextInt();
		System.out.println("B과목:>>>");
		int iBPoint = sc.nextInt();
		System.out.println("C과목:>>>");
		int iCPoint = sc.nextInt();
		// 모든 점수의 평균을 구한다.
		iAvgPoint = (iAPoint + iBPoint + iCPoint) / 3;
		// 총점에 따른 합격여부 함수 호출
		passAtoTotalScore(iAPoint, iAPoint, iCPoint, iSumpDropPoint);
		
		// 평균 합산에 따른 함수 호출
		passAtoAvg(iAvgPoint, iAvgDropPoint);
		
		// 과락에 따른 합격여부 함수 호출
		passAtFalldownScore(iAPoint, iAPoint, iCPoint, idropMarginPoint);
		sc.close();
	}
	
	// 총점에 따른 합격여부
	public static void passAtoTotalScore(
			int iApoint, int iBpoint, int iCpoint, int passLine) {
		int iSumPoint = 0;
		iSumPoint = iApoint + iBpoint + iCpoint;
		if(iSumPoint > passLine) System.out.println("합격:합산점수초과");
		else System.out.println("불합격:합산점수미만");
	}

	// 평균 합산에 따른 합격여부
	public static void passAtoAvg(
			int iAvgResult, int passLine) {
		if(iAvgResult > passLine) System.out.println("합격:평균점수초과");
		else System.out.println("불합격:평균점수미만");	
	}
	
	// 과락에 따른 합격여부
	public static void passAtFalldownScore(
			int iApoint, int iBpoint, int iCpoint, int passLine) {
		if((iApoint > passLine) 
				&& (iBpoint > passLine) 
				&& (iCpoint > passLine)) System.out.println("합격:과락점수없음");
		else System.out.println("불합격:과락점수존재");
	
	}
	
}