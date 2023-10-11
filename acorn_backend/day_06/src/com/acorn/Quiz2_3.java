package com.acorn;

import java.util.Scanner;

public class Quiz2_3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("3이상의 홀수 자연수를 입력하시오 : ");
		int x = sc.nextInt();


		if(x >= 3 && x % 2 == 1) // 만약 x가 3이상의 자연수이고, 홀수 라면
		{
			int xArr[] = new int[x]; //xArr에 x만큼의 길이를 준다.
			for(int i=0; i<(x/2)+1; i++) // x의 인덱스 값을 구하기 위한 식. (x/2)+1 = (int)중앙값 (얘가 젤 크니까 기준)
			{
				xArr[i] =i+1; // xArr[i] 는 (처음엔 i=0) = i+1 (0번째 인덱스에 1을 추가).
				xArr[x-1-i] =i+1; // xArr[x-1-i] (마지막 인덱스 값은 x값에서 1을 빼는거니까.) = i+1 (처음엔 0이니까 값은 1)
				
			}
			for(int i=0; i<x; i++) //i가 x보다 작으면 i++ == 배열을 출력하기위해 주는 for 문.
			{
				System.out.print(xArr[i] + " ");
			}
		}

		sc.close();	
	}


}

