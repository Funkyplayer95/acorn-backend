package com.acron.java1;

public class Review2Main {

	public static void main(String[] args) {
		
		//switch+case
		//해당 case로 break를 만날 때까지 실행
		//사용가능한 변수 : 정수, 문자, 문자열
		String day = "수";
		switch (day) {
		case "월":
			System.out.println("주중1");
			break;
		case "화":
			System.out.println("주중2");
			break;
		case "수":
			System.out.println("주중3");
			break;
		case "목":
			System.out.println("주중4");
			break;
		case "금":
			System.out.println("주중5");
			break;
		default:
			System.out.println("주말입니다");
			break;
		}
		Weekday week = Weekday.FRI;
		switch(week) {
		case MON :
			break;
		case THE :
			break;
		case WED :
			break;
		case THU :
			break;
		case FRI :
			break;
		case SAT :
			break;
		case SUN :
			break;
		default:
			break;

		}
	}

}