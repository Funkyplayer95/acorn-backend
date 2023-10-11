package study.class01;

public class Employee2 { //사람이라 생각하자
	// 필드(속성) 영역 //사람의 구성요소
	int iEmpNo;
	String sEmpName;
	double dSalary;
	
	// 기본 생성자
	public Employee2() { } // 기본 생성자는 없어도 JVM 에서 자동으로 만들어줌.

	// 인자있는 생성자
	public Employee2(int iEmpNo, String sEmpName, double dSalary) {
		this.iEmpNo = iEmpNo;
		this.sEmpName = sEmpName;
		this.dSalary = dSalary;
	}
	
	// 메소드 영역 - 동적 메소드
	public double getReturnTax(double ratio) {
		//tax 금액을 계산
		double Tax = dSalary * ratio;
		return Tax;
	}
	
	
	
}
