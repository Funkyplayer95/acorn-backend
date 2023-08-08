package study.class01;

public class Main02 {

	public static void main(String[] args) {
		// 변수 선언과 동시에 초기화
		// 사원번호, 사원이름, 월급
		//사원정보
		int iEmpNo = 2;
		String sEmpName = "홍길2";
		double dSalary = 2000.0;
		//리턴 세금
		double dRetTax = 0.0;
		double dRatio = 0.075;
		//관리자 정보
		int iEmpNoMgr = 2;
		String sEmpNameMgr = "홍길2";
		double dSalaryMgr = 5000.0;
		//리턴 세금
		double dRetTaxMgr = 0.0;
		double dRatioMgr = 0.2;
		
		
		
		// 1안 // 오로지 변수 선언을 하여 계산하는 방식.
		//	리턴세금 = 월급 * 비율;
		dRetTax = dSalary * dRatio;
		System.out.println("회수세금 : " + dRetTax);
		// 관리자꺼
		dRetTaxMgr = dSalaryMgr * dRatioMgr;
		System.out.println("회수세금 : " + dRetTaxMgr);
		
		
		// 2안: 정적 메소드 사용 
		// 메소드명
		dRatio = 0.09;
		dRetTax =  returnTax(dSalary, dRatio);
		System.out.println("회수세금 : " + dRetTax);
		// 3안: Main02 객체를 생성 // 지금쓰고있는 이 창은 Main객체 안이고 Main02는 밖에있다.
		// 메인객체.메소드명
		Main02 main02 = new Main02(); // Main02에 대한 객체를 선언하여 불러오는 작업
		dRatio = 0.1;
		dRetTax = main02.countryMoney(dSalary, dRatio); //Main02의 함수를 불러올꺼면 main02하고 . 을 찍어 불러와야한다.
		System.out.println("회수세금 : " + dRetTax);
		
		
		//System.out.println("회수세금:" + 리턴세금);
	}
	
//	 2안
	public static double returnTax(double dSalary , double dRatio) {
		
		double dRetTax = dSalary * dRatio ;
			return dRetTax;
			
	}
	
	// 3안
	public double countryMoney(double dSalary , double dRatio) {
		double dRetTax = dSalary * dRatio;
		return dRetTax;
}	

}
