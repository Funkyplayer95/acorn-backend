package study.static01;

// 클래스 멤버 접근 수식(Access modifier)
// 1. private, (package), protected, public
// 가. 기능: 클래스 멤버에 대한 접근 권한 설정
// 나. 의미
// 1) private: 선언된 클래스 안에서만 직접 접근 가능
// 2) (package): 같은 패키지의 클래스들에서 직접 접근 가능
// 3) protected: 같은 패키지에 있거나 상속하는 클래스에서 직접 접근 가능
// 4) public: 어디서라도 직접 접근 가능
// 2. 클래스 파일 이름: public 클래스 이름과 동일
public class Main {
	static int iMainValue= 0;
	public static void main(String[] args) { // static 이 붙은건 class 변수
		System.out.println(StaticTest.number1);
		StaticTest.number1 = 100;
		StaticTest.printInfo();
		
		StaticTest sTest = new StaticTest();
		sTest.printInfo2();
		
		
	}
}
