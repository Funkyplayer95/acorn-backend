package study.class01;

// OOP(Object-Oriented Programming)
// 클래스 : 필드(속성) + 생성자 + 메소드
// 객체(개체 : object) : new 생성자
// 인스턴스(Instance)
// 클래스 선언(정의)
// [수식어] class 클래스명 {}
public class Main {

	public static void main(String[] args) {
		Employee employee1 = new Employee(1, "홍길동", 1000.0);
		System.out.println(employee1.getiEmpNo());
		
		double dRet = employee1.getReturnTax1(0.075);
		System.out.println("회수세금 : " + dRet);
		
//		Manager manager = new Manager(10, "홍길동관리자", 5000.0);
//		dRet = manager.getReturnTax(0.2);
//		System.out.println("회수세금 : " + dRet);
	}	

	
}