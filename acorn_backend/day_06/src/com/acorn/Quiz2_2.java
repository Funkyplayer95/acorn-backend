package com.acorn;

import java.util.Scanner;

public class Quiz2_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("몇개의 숫자를 더할까요? : ");
		int x = sc.nextInt();
		int[] xArr = new int[x];
		int total = 0;
		for(int i=0; i < x; i++)
		{
			System.out.print("배열 " + i+"번째 인덱스에 넣을 값 : ");
			xArr[i] = sc.nextInt();
			total += xArr[i];
		}
		System.out.println("총합 : " + total);
		
		
		sc.close();
	}

}
