package study.class01;

public class Employee { //사람이라 생각하자
	// 필드(속성) 영역 //사람의 구성요소
	// private을 사용하게되면 간섭이 불가하지만 getter/setter를 선언하여 가능 하다.
	
	private int iEmpNo; // 값 없이 선언만 하게 된다면 int = 0으로 쓰레기데이터가 들어가있음.
	private String sEmpName; // 값 없이 선언만 하게 된다면 String = null로 쓰레기데이터가 들어가있음.
	private double dSalary; // 값 없이 선언만 하게 된다면 double = 0.0으로 쓰레기데이터가 들어가있음.
	
	//클래스를 작성할 때 생성자를 만들지 않으면
	// 자바 컴파일러가 기본생성자를 자동으로 생성
	// 생성자 리턴타입이 없고 클래스 이름과 동일하다
	
	// 기본 생성자
	public Employee() { } // 기본 생성자는 없어도 JVM 에서 자동으로 만들어줌.

	// 인자있는 생성자 // this. 을 입력하여야 같은 이름으로 선언하더라도, 클래스의 속성을 호출하는거라 적용가능)
	public Employee(int iEmpNo, String sEmpName, double dSalary) 
	{
		this.iEmpNo = iEmpNo;
		this.sEmpName = sEmpName;
		this.dSalary = dSalary;
	}
	
	
	public int getiEmpNo() {return iEmpNo;}
	public void setiEmpNo(int iEmpNo) {this.iEmpNo = iEmpNo;}
	
	
	public String getsEmpName() {return sEmpName;}
	public void setsEmpName(String sEmpName) {this.sEmpName = sEmpName;}
	
	public double getdSalary() {return dSalary;}
	public void setdSalary(double dSalary) {this.dSalary = dSalary;}
	
//	Tax = ((dSalary*12) + (dSalary*1.13)) * ratio;
	
	// 메소드 영역 - 동적 메소드 (다른 클래스에서도 사용이 가능한 메소드. 대신 메소드를 호출 하고 불러야함)
			 // - 정적 메소드 (static을 넣어서 만드는 메소드. 해당 클래스에서만 사용이 가능하다.)
	/**
	 * 
	 * @param ratio 세금 비율
	 * @param type 
	 * @return
	 */
	public double getReturnTax(double ratio) { // static이 아니기 떄문에 호출 시 객체를 선언해주고 .찍어서 불러야함
		//tax 금액을 계산
		//변수 선언
		double Tax = 0.0 ;
        Tax = dSalary * ratio;
        return Tax; // Tax값을 첫줄처럼 초기화하지 않으면 return 값에 빨간줄 가게 됨. 습관화 하자
	}
	
	//메소드 오버로딩
	public double getReturnTax(double ratio, int months)
	{
		//tax 금액계산
		//변수선언
		double Tax = 0.0;
		// 리턴텍스 계산 : dSalary * 0.075
		if(months == 12)
			Tax = ((dSalary*12) + (dSalary*1.13)) * ratio;
		else if( (months >= 1) && (months < 12))
				Tax = (dSalary * months) * ratio;
		// 계산된 결과를 변수에 저장
		// return 변수명
		return Tax;
	}
	
	
}
