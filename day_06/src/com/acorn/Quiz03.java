package com.acorn;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);



		while(true)
		{
			System.out.println("1 이상의 숫자를 입력하시오 : ");

			int x = sc.nextInt();

			if(x>0)
			{
				for(int i=1; i <= x ; i++)
				{
					System.out.print(i + " ");
				}
				break;
			}
			else
			{
				System.out.println("1 이상의 숫자를 입력해주세요");
			}
			
		}
		sc.close();



	}

}
