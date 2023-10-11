package com.acorn;

import java.util.Scanner;

public class Study05 {

	public static void main(String[] args) {
//		문자열을 입력 받아: 
//			String sInputMsg; 
//			sInput.length() 
//		(문자)배열을 선언: 
//			문자 하나하나를 저장: 
//				charAt(인덱스) 
//		검색할 문자가: 미리 검색문자 
//			변수 선언과 초기화 or 
//			키보드 입력 
//		문자열에 몇 개 들어가 
//		있는지 개수를 출력
		
		Scanner sc = new Scanner(System.in);
		String sInputMsg = ""; char[] cArray; int iArraySize = 0;
		char cChar = 'p'; int iCount = 0;
		
		System.out.print("문자열을 입력:>>> ");
		sInputMsg = sc.nextLine();	// application
		
		iArraySize = sInputMsg.length();
		
		cArray = new char[iArraySize];
		
		// 문자열에서 하나하나의 문자열을 문자배열에 저장
		for(int i = 0; i < iArraySize; i++) { cArray[i]= sInputMsg.charAt(i); }
		
		for(int i = 0; i < iArraySize; i++) { System.out.print(cArray[i] + "#"); }
		
		System.out.println();
		
		for(int i = 0; i < iArraySize; i++) { if(cArray[i] == cChar) iCount++; }
		System.out.println("일치하는 문자갯수: " + iCount);
		
		
		
		
		
		
		
		
		
		
		
	}
}
