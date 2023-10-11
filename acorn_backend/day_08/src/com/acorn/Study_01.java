package com.acorn;

import java.util.Scanner;

public class Study_01 {

	public static void main(String[] args) {
		//필드영역
		Scanner sc = new Scanner(System.in);
//		String Msg1 = "첫번째 값은 : ";
//		String Msg2 = "두번째 값은 : ";
//		String resultMsg = "결과값은 : ";
		int result = 0;
		double result1 = 0;
//		intPlus(sc, Msg1, Msg2, resultMsg);
//		intPlus(sc, Msg1, Msg2, resultMsg);
//		intPlus(sc, Msg1, Msg2, resultMsg);
//		intMinus(sc, Msg1, Msg2, resultMsg);
		
		
		result = Add.intPlus(3, 5);
		System.out.println(result);

		Add add = new Add();
		result =add.addPlus(3, 20, " 안녕하세요");
		System.out.println(result);
		
		result = Sub.intMinus(6, 3);
		System.out.println(result);
		
		result = Multyply.intMulty(5, 4);
		System.out.println(result);
		
		result1 = Div.intDiv(6.0, 2);
		System.out.println(result1);
		sc.close();
	}
	
	public static void intPlus(Scanner sc, String Msg1, String Msg2, String resultMsg) {
		
		int A ;
		int B ;
		int result = 0 ;
		System.out.println("덧셈 연산");
		System.out.print(Msg1);
		A = sc.nextInt();
		System.out.print(Msg2);
		B = sc.nextInt();
		
		result = A + B;
		System.out.println(resultMsg + result);
			
	}
	public static void intMinus(Scanner sc, String Msg1, String Msg2, String resultMsg) {
		int A ;
		int B ;
		int result = 0 ;
		System.out.println("뺄셈 연산");
		System.out.print(Msg1);
		A = sc.nextInt();
		System.out.print(Msg2);
		B = sc.nextInt();
		
		result = A - B;
		System.out.println(resultMsg + result);
	}
	public static int intMult(int first, int second) {
		int result = first * second ;
		return result;		
	}
	public static double intDiv(double first, double second) {
		double result = first / second ;
		return result;		
	}

}
