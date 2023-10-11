package com.acorn;

import java.util.Scanner;

public class Study02 {

	public static void main(String[] args) {
		
		
		

		
		// random함수는 static 속성과 double속성을 가지고 있다.
		// double과 float의 차이는 둘다 실수 이지만, float가 쫌더 짧고, double가 좀더 긴 소수점을 만들어준다
		
//		System.out.println(((int)(Math.random()*100))); // 0이상 100미만 사이의 난수 생성
		
		//키보드 입력 객체 생성
		Scanner sc = new Scanner(System.in);
		
		//두 개의 숫자를 키보드 입력
		
		//두개의 난수를 생성
//		int iRanNum01 = ((int)(Math.random()*100))+1; 
//		int iRanNum02 = ((int)(Math.random()*100))+1;
//		
//		System.out.println(iRanNum01 + ":" +iRanNum02);
//		
//		if(iRanNum01 < iRanNum02)
//		{
//		System.out.println(iRanNum01 + "우승");
//		}
//		else if(iRanNum01 > iRanNum02)
//		{
//		System.out.println(iRanNum02 + "우승");
//		}
		
		
		// 우승조건 : 두개의 수의 차가 가장 적은 수
		
		// 우승 여부 출력
		//-----------------------
		
		boolean boo = true;
		while(boo) {
			
		
		System.out.println("우승 조건을 선택해주세요");
		System.out.println("1.누가 더 큰가");
		System.out.println("2.누가 더 작은가");
		System.out.println("99.종료");
		int x = sc.nextInt();
		if(x==99) {
			System.out.println("종료되었습니다.");
			break;
		}
		//빈 요소 생성
		int[] RandomNumarr = new int[20]; //{}가 아니고 new int[100]으로 준 이유는, 배열값이 0으로 되어있어 50번줄 실행시 에러가 나온다.
		
		// 배열안에 1~100사이 난수를 배열 0~99번째에 등록
		for(int i=0; i < 20; i++) {
			int iRandomNum = ((int)(Math.random()*100))+1;
			
			RandomNumarr[i] = iRandomNum;
		}
		// 100번의 배열안에서, 배열안의 랜덤번째 랜덤숫자와 컴퓨터 난수와 대결하는 명령 입력
		if(x == 1) {
			for(int i=0; i < 20; i++) {
				int ComRanNum = ((int)(Math.random()*100))+1;
				int num = ((int)(Math.random()*20));
				// 무엇이 더 큰지를 for문 안에 조건을 넣어서 어떤값이 어떠한지 입력하기
				if(RandomNumarr[num] >= ComRanNum)
				{
					System.out.println("RandomNumarr >= ComRanNum : " + (RandomNumarr[num] - ComRanNum));
				}
				else if(ComRanNum >= RandomNumarr[num])
				{
					System.out.println("RandomNumarr <= ComRanNum : " + (ComRanNum - RandomNumarr[num]));
				}	
			}
		}
		if(x == 2) {
			for(int i=0; i < 20; i++) {
				int ComRanNum = ((int)(Math.random()*100))+1;
				int num = ((int)(Math.random()*20));
				// 무엇이 더 큰지를 for문 안에 조건을 넣어서 어떤값이 어떠한지 입력하기
				if(RandomNumarr[num] < ComRanNum)
				{
					System.out.println("RandomNumarr값이 조금 더 작습니다 " + RandomNumarr[num] + ":" + ComRanNum);
				}
				else if(ComRanNum < RandomNumarr[num])
				{
					System.out.println("ComRanNum값이 조금 더 작습니다 : " + RandomNumarr[num] + ":" + ComRanNum);
				}	
			}
		}
	}
		
		
		
		sc.close();
	}

}
