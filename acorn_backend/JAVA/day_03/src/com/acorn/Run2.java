package com.acorn;

import java.util.Scanner;

public class Run2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 값을 입력해주세요 : ");
		int a = sc.nextInt();
		System.out.print("두 번째 값을 입력해주세요 : ");
		int b = sc.nextInt();

		int e = a + b;
		int r = a - b;
		int t = a * b;
		int y = a / b;
		System.out.println("첫 번째 정수 : " + a);
		System.out.println("두 번째 정수 : " + b);
		System.out.println("더하기 결과 : " + e);
		System.out.println("빼기 결과 : " + r);
		System.out.println("곱하기 결과 : " + t);
		System.out.println("나누기 결과 : " + y);

		sc.close();

		calTwoNum(a, b);

	}

	public static void calTwoNum(int num1, int num2) {
		System.out.println("더하기 결과 : " + (num1 + num2));
		System.out.println("빼기 결과 : " + (num1 - num2));
		System.out.println("곱하기 결과 : " + (num1 * num2));
		System.out.println("나누기 결과 : " + (num1 / num2));
	}
 // ctrl + alt + shift + L = 오류찾기
 // ctrl + I = 들여쓰기 줄 정렬하기
}
