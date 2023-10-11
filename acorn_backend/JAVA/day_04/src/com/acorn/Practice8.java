package com.acorn;

import java.util.Scanner;

public class Practice8 {

	public static void main(String[] args) {

		// 4자리 정수를 받는다
		// 4자리 중복값이 없으면 생성 성공
		// 중복값이 있으면 '중복값있음'
		// 자리수가 안맞으면 '자리수 안맞음'
		// 단 제일 앞자리는 0이 올 수없음.
		Scanner sc = new Scanner(System.in);

		while(true) {
			// 4자리 값 받기

			System.out.println("비밀번호 4자리를 입력하세요. 단 , 첫 번째 자리에 1~9만 가능합니다.");

			//첫번째 자리			
			System.out.print("1번 : ");
			String x = sc.nextLine();
//			if(x>9)
//			{
//				System.out.print("한자리만 입력해주세요 \n");
//				continue;
//			}

			//두번째 자리
			System.out.print("2번 : ");
			String y = sc.nextLine();
//			if(y>9)
//			{
//				System.out.print("한자리만 입력해주세요 \n");
//				continue;
//			}

			//세번째 자리
			System.out.print("3번 : ");
			String z = sc.nextLine();
//			if(z>9)
//			{
//				System.out.print("한자리만 입력해주세요 \n");
//				continue;
//			}

			//네번째 자리
			System.out.print("4번 : ");
			String l = sc.nextLine();
//			if(l>9)
//			{
//				System.out.print("한자리만 입력해주세요 \n");
//				continue;
//			}

			//중복된 자리값 구하기 -- String.equals() = String값 비교, 부정을 하고싶을때는 !를 앞에 붙이면 된다.
			if(!x.equals(y) && !x.equals(z) && !x.equals(l))
			{
				if(!y.equals(z) && !y.equals(l))
				{
					if (!z.equals(l))
					{
						//int형을 String으로 변환
						String pw = x+y+z+l; 
						if(Integer.parseInt(pw) > 999 && Integer.parseInt(pw) < 10000 ) // String문자를 int형으로 변환하여 비교
						{
							System.out.println("생성 성공");
							break;
						}
						else {
							System.out.println("비밀번호 조건에 맞지 않습니다. \n");
							continue;
						}
					}
					else
					{
						System.out.println("중복 값 있음. 생성불가 \n");
						continue;
					}

				}
				else
				{
					System.out.println("중복 값 있음. 생성불가 \n");
					continue;
				}
			}
			else
			{
				System.out.println("중복 값 있음. 생성불가 \n");
				continue;
			}

		}
		sc.close();
		System.out.println("비밀번호 생성이 완료 되었습니다.");
	}

}