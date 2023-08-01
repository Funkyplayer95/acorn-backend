package com.acorn;

import java.util.Scanner;

public class Study03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int selectNum = 0;
		
		boolean num = true;
		while(num) {
			
			System.out.println("원하는 메뉴를 선택해주세요. \n 1.더하기 \n 2.빼기 \n 3.곱하기 \n 4.나누기 \n 99.종료");
			selectNum = sc.nextInt();
				if(selectNum == 99) {
					System.out.println("종료합니다");
					break;
				}
				else if((selectNum != 1) && (selectNum != 2) && (selectNum != 3) && (selectNum != 4) && (selectNum != 99)) {
					System.out.println("잘못된 메뉴를 입력하셨습니다.");
					continue;
				}
			int calNum = 0;
			
			System.out.print("첫번째 숫자를 입력하세요 >>");
			int x = sc.nextInt();

			System.out.print("두번째 숫자를 입력하세요 >>");
			int y = sc.nextInt();
			
				if (selectNum == 1) {
					calNum = x + y;
				}
				else if (selectNum == 2) {
					calNum = x - y;
				}
				else if (selectNum == 3) {
					calNum = x * y;
				}
				else if (selectNum == 4) {
					calNum = x / y;
				}
	
			System.out.print("계산 : " + calNum + "\n");
			
		}
		
		sc.close();
//		System.out.println("원하는 메뉴를 선택해주세요. \n 1.더하기 \n 2.빼기 \n 3.곱하기 \n 4.나누기 \n 99.종료");
//		int a = sc.nextInt();
//		
//		if(a == 1) {
//			System.out.println("첫번째 값을 선언하세요");
//		}
//		if(a == 2) {}
//		if(a == 3) {}
//		if(a == 4) {}
//		if(a == 99) {}
		
	}

}
