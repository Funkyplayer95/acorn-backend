package javabasic;

//public 선언되는 클래스는 하나만 존재
//public 선언되는 클래스가 파일이름이 된다.
public class Main {

	public static void main(String[] args) {
//		new Main02();
		// 변수선언 : 데이터타입 변수명; 초기화 -> 데이터타입 변수명 = 값; ---> 변수명 = 값
		// 원시 데이터타입 : int, long(주의 long a = 1234L), short, byte, double, char, float(주의 float a = 0.0f;(엥간하면 쓰지말것))  
		// 객체형 데이터타입 : String str = ""; <내가 만드는 모든 class들>
		// 동일 변수명을 가진 변수는 선언을 한 번 밖에 할 수 없다.
		// int a; --> 이후에 int a; 불가. 그냥 a; 쓰면 됨
		// 함수 : 함수명(); // 하나하나 만들기에는 복잡해지니 어떠한 함수를 하나 만들어서 기능을 구현하는게 짱이다.
		int a =2; int b= 3; int c= a+b;
		c = add(a,b); // 함수 호출 a,b를 아큐먼트(함수인자(변수))
		// 함수로 부터 넘어온 값은 저장되어야 한다. 저장되는 곳은  -> 변수
		System.out.println(c);
		//
		// 조건문
//		if(조건식)
//		int i =0;
//		if(i < 20) {해당 조건이 참일떄 실행} else {해당 조건이 거짓일때 실행}
		
		// 반복문
//		for(초기값; 조건문; 증감값)
//		for(i=0; i<10; i++) { System.out.println(10);}

		// 배열
		// int,double,String
		// int[] iArray = new int[크기];
		// double[] dArray = new double[크기];
		// String[] sArray = new sArray[크기];
		// 배열변수[인덱스]
		

	}
	
	// 함수호출 받은 족 : 파라메터(함수인자(변수)) : 리턴값 함수명(함수인자)
	public static int add(int a, int b){ 
		int c;
		c = a+b;
		return c;
	}
	
}

//class Main02 {
//	
//}