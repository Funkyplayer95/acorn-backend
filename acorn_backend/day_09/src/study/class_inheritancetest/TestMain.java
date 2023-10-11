package study.class_inheritancetest;

public class TestMain {

	public static void main(String[] args) {
		Test1 test1 = new Test1();
		Test2 test2 = new Test2();
		
		test1.setA(test2.getC());
		test1.setB(test2.getD());
		
		
	}

}
