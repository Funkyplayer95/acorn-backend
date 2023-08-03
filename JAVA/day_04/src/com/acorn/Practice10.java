package com.acorn;

import java.util.Scanner;

public class Practice10 {

	public static void main(String[] args) {

//		int[] iArray = new int[10];
//		int[] iArray1 = new int[10];
//
//		for(int i=0; i<10 ; i++) {
//			iArray[i] = i+1;
//			System.out.print(iArray[i] + " ");
//		}
//		System.out.println();
//		for(int i=9; i>=0 ; i--) {
//			iArray1[i] = i+1;
//			System.out.print(iArray1[i] + " ");
//		}
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("정수 입력 : ");
//		int x = sc.nextInt();
//		
//		int[] iarr;
//		iarr = new int[x];
//		for(int i=0; i < x; i++)
//		{
//			iarr[i] = i + 1;
//			System.out.print(iarr[i] + " ");
//		}
//		
//		sc.close();

//		String[] sArray = new String[5];
//		sArray[0] = "사과";
//		sArray[1] = "귤";
//		sArray[2] = "포도";
//		sArray[3] = "복숭아";
//		sArray[4] = "참외";
//		
//		for(int i = 0; i < sArray.length; i++)
//			if(sArray[i].equals("귤"))
//			{
//				System.out.println(i + "번째에 " + sArray[i] + "이 있습니다");	
//			}
			

//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("문자열을 넣어주세요");
//		String x = sc.nextLine();
//		
//		char[] cArr = new char[x.length()];
//		for(int i =0; i < x.length(); i++)
//		{
//			cArr[i] = x.charAt(i);
//			System.out.print(x.charAt(i));
//		}
//		
//		System.out.println("\n찾을 문자열을 입력하세요");
//		String y = sc.nextLine();
//		char yArr = y.charAt(0);
//		int matchY = 0;
//		for(int i = 0; i< cArr.length; i++)
//		{
//			if(yArr == cArr[i]) {matchY++;}
//		}
//		System.out.println("일치문자갯수 : " + matchY);
//		
//		sc.close();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요");
		int num = sc.nextInt();
		if(num > 6)
		{
			System.out.println("잘못된 값을 입력하였습니다");
			System.exit(0);
		}
		char[] week = new char[7];
		week[0] = '월';
		week[1] = '화';
		week[2] = '수';
		week[3] = '목';
		week[4] = '금';
		week[5] = '토';
		week[6] = '일';
		
		System.out.println("해당 요일은 : " + week[num] + "요일 입니다");
		
		
		sc.close();
		
		
		
		
		}
	}

