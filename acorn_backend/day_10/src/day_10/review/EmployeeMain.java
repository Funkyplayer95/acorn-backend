package day_10.review;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee employee = new Employee(1,"홍길동",1000.0);
		
		double yearMoney = employee.getSalaryForYear();
		System.out.println(yearMoney);

	}

}
