package com.acorn;

import java.util.Scanner;

public class Study01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // 스케너로 입력값을 받을 준비
		String sInputMsg = ""; // sInputMsg 라는 문자열에대한 초기화
		char[] cArray; // cArray라는 문자배열 생성
		int iArraySize = 0; // iArraySize라는 길이값 초기화
		int iCount = 0; // iCount는 갯수값 입력받을 변수
		
		System.out.print("문자열을 입력 : "); // 스케너 입력전 문구생성
		sInputMsg = sc.nextLine(); //application 라는 문자열 대입
		System.out.print("찾고싶은 문자를 입력 : ");
		char cChar = sc.next().charAt(0); // 찾고자하는 문자 대입
		
		iArraySize = sInputMsg.length(); // 길이값은 문자열의 길이만큼
		
		cArray = new char[iArraySize]; // cArray라는 문자 배열의 길이는 문자열 길이값  
		
		//문자열에서 하나하나의 문자열을 문자배열에 저장
		for(int i = 0 ; i < iArraySize; i++)
		{
			cArray[i] = sInputMsg.charAt(i);
		}
		// 문자배열이 하나하나 출력될때 #을 붙여 구분되게 생성 (#은 컴퓨터가 인식할때 띄어쓰기랑 동일한 기능이라했음)
		for(int i = 0 ; i < iArraySize; i++)
		{
			System.out.print(cArray[i] + "#");
		}
		
		System.out.println(); // 한줄 띄어준다
		
		//cArray에 있는 인덱스값과 내가 찾고자하는 문자값이 같으면 iCount에 1추가 과정
		for(int i =0 ; i < iArraySize; i++)
		{
			if(cArray[i] == cChar) {
				iCount++;
			}
		}
		
		System.out.println("일치하는 문자 갯수 : " + iCount );
		
		sc.close();
	}

}
