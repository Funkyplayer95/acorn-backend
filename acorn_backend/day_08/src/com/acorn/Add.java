package com.acorn;


public class Add {
	//필드(속성) 영역

	// 생성자 영역 : public : 클래스명() : 기본생성자 / 인자가 있는 생성자

	// Getter / Setter : 메소드 영역


	///////////////////////////////////////////////////////
	// 일반 메소드 영역 : 정적 / 동적

	// 정적 메소드 영역

	public static int intPlus(int A , int B)
	{
		int result = 0;

		result = A + B ;
		return result;

	}
	/////////////////////////////////////////////////////////

	//동적 메소드 영역
	public int addPlus(int A , int B)
	{
		int result ;
		System.out.println(A+B);
		result = A+B;
		return result;
		

	}
	/////////////////////////////////////////////////////////
	
	//메소드 오버로딩 영역
	public int addPlus(int A , int B, String Msg)
	{
		int result ;
		result = A+B;
		System.out.println(result + Msg);
		return result;
	}
	
	public String addPlus1(int A , int B, String Msg)
	{
		String result ;
		result = A+B + Msg;
		System.out.println(result);
		return result;
	}
}


