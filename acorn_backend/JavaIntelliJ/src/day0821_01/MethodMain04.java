package day0821_01;

// 메서드 오버로딩
public class MethodMain04 {

	public static void main(String[] args) {		
		overLoadingTest();
		overLoadingTest("korean");
		overLoadingTest(2023);
		overLoadingTest("korea", 2023);
	}

	public static void overLoadingTest() {
		System.out.println("안녕하세요");
	}

	public static void overLoadingTest(String national) {
		System.out.println("안녕하세요 저는 " + national + "입니다.");
	}
	
	public static void overLoadingTest(int year) {
		System.out.println("금년은 " + year + "년 입니다.");
	}
	
	public static void overLoadingTest(String national, int year) {
		System.out.println("안녕하세요 저는 " + national + "이고, "
				+ "올해는 " + year + "년 입니다.");
	}



}
