package com.acorn;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);



		while(true)
		{
			System.out.println("1 이상의 숫자를 입력하시오 : ");

			int x = sc.nextInt();
			int num = 0;
			if(x>0)
			{
				for(int i=1; i <= x ; i++)
				{
					num += i;
					System.out.print(i + " ");
				
				}
				System.out.print("\n" + num);
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
