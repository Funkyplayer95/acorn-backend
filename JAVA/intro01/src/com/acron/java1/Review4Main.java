package com.acron.java1;

public class Review4Main {

	public static void main(String[] args) {
		// 반복문
		// for(초기값; 조건; 증감문;)
		for (int i = 1; i < 21; i++) {
			// 실행문
			System.out.print(i+":");
			if( i % 2 == 0) {
				System.out.println(" 짝수");
			}
			else {
				System.out.println(" 홀수");
			}
				
		}
		for (int i = 20; i> 0; i--) {
			System.out.println(i + ":");
			
			if( i == 3) {
				System.out.println((i-1) + "번에서 끊겠습니다.");
				break;
			}
		}
		
		
	// 배열(array) : 하나의 변수 이름에 같은 타입의 값들 여러개를 저장하기위한 자료구조
		String[] names = {"k1","k2","k3","k4","k5"};
		System.out.println("차 이름으로 가장 알맞은 것은?: " + names[4]);
		
		for(String name : names) {
			System.out.println(name);
		}
		
		// while(조건식) {반복 증감}
		int j = 0;
		while(j<names.length) { 
			System.out.print(names[j]);
			j++;
		}
	}
	
}
