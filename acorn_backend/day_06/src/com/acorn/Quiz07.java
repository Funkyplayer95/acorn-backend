package com.acorn;

import java.util.Scanner;

public class Quiz07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("양의 정수값을 입력하세요 : ");
		int x = sc.nextInt();
		for(int i=1; i <= x; i++)
		{
			int[] iArr = new int[x+1];
			iArr[i] = i;
			System.out.print(iArr[i] + " ");
		}
		sc.close();
	}

}
