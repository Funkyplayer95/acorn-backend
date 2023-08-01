package com.acron.java2;

import java.util.Random;

public class VariableMain01 {
	public static void main(String[] args) {
		//강제(명시적) 전환
		//(데이터타입)
		//int testData = 200;
		//short testData2;
		// testData2 = (short)testData;
//		byte byteNumber = 0;
//		short shortNumber = 257;
//		byteNumber = (byte)shortNumber;
//		System.out.println(byteNumber);
		Random rand = new Random();
		int a = rand.nextInt(9) + 1;
		int b = rand.nextInt(9) + 1;
		int c = rand.nextInt(9) + 1;
		int d = rand.nextInt(9) + 1;
		
			if (a != b && a != c && a != d) {
				if( b != c && b != d) {
					if( c != d) {
						System.out.println("비밀번호 값은? : "+ a+b+c+d);
					}else {
						System.out.println("다시 생성해보세요");
					}
				}else {
					System.out.println("다시 생성해보세요");
				}
			}else {
				System.out.println("다시 생성해보세요");
		}
		
	}
}
