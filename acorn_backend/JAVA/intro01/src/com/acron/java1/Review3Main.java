package com.acron.java1;

public class Review3Main {

	public static void main(String[] args) {
		// 연산자
		// 할당연산자 : = 
		// 산술연산자 : +, -, *, /, %(나머지), //(몫), **(제곱근)
		// 복합할당 연산자 : +=, -=. /=, *=, %=
		// 증감연산자 : ++, -- 
		// 비교연산자 : >,<,==,!=, <=, >=
		// 논리연산자 : &&, ||, !
		
		int a = 8;
		if(a % 2 == 0){
		 System.out.println("a" + "는 짝수 입니다.");
		 } else {
			 System.out.println('a'+ "는 홀수 입니다.");
		 }
		int b = 1;
		if(b>0) {
		System.out.println("양수");
		} else if (b<0) {
			System.out.println("음수");
		}
		else {
			System.out.println(0);
		}
	}
		
}