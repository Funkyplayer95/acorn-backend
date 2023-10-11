package com.acorn;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
		System.out.println("1.입력");
		System.out.println("2.수정");
		System.out.println("3.조회");
		System.out.println("4.삭제");
		System.out.println("7.종료");
		System.out.print("메뉴 번호를 입력하세요");
		int m = sc.nextInt();	
		
		if(m==1)
		{
			System.out.println("입력 메뉴 입니다.");
			break;
		}
		else if(m==2)
		{
			System.out.println("수정 메뉴 입니다.");
			break;
		}
		else if(m==3)
		{
			System.out.println("조회 메뉴 입니다.");
			break;
		}
		else if(m==4)
		{
			System.out.println("삭제 메뉴 입니다.");
			break;
		}
		else if(m==7)
		{
			System.out.println("프로그램을 종료합니다.");
			break;
		}
		else
		{
			System.out.println("잘못된 값을 입력 받았습니다.");
			continue;
		}
		
		}
		sc.close();
	}

}
