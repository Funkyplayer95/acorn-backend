package com.acorn;

import java.util.Scanner;

public class Study_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하시오 : ");
		int x = sc.nextInt();
		
		if(x > 0)
		{
			if(x % 2 == 0)
			{
			System.out.println("입력된 값은 짝수 입니다.");	
			}
			else
			{
				System.out.println("입력된 값은 홀수 입니다.");
			}
		}
		else if(x == 0)
		{
			System.out.println("0을 입력하셨습니다.");
		}
		else
		{
		System.out.println("음수의 값을 입력하셨습니다.");	
		}
		
		
		sc.close();

	}

}
