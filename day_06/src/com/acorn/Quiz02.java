package com.acorn;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("계절이 궁금한 월을 입력하시오(숫자만) : ");
		int Season = sc.nextInt();
		String month = "";

		switch (Season)
		{
		case 1 : month = "1월은 겨울 입니다.";
		break;
		case 2 : month = "2월은 겨울 입니다.";
		break;
		case 3 : month = "3월은 봄 입니다.";
		break;
		case 4 : month = "4월은 봄 입니다.";
		break;
		case 5 : month = "5월은 봄 입니다.";
		break;
		case 6 : month = "6월은 여름 입니다.";
		break;
		case 7 : month = "7월은 여름 입니다.";
		break;
		case 8 : month = "8월은 여름 입니다.";
		break;
		case 9 : month = "9월은 가을 입니다.";
		break;
		case 10 : month = "10월은 가을 입니다.";
		break;
		case 11 : month = "11월은 가을 입니다.";
		break;
		case 12 : month = "12월은 겨울 입니다.";
		break;
		default : month = "1년은 12개월만 존재합니다.";
		break;
		}
		System.out.println(month);

		sc.close();

	}

}
