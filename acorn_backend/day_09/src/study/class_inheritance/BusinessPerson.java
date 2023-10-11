package study.class_inheritance;

public class BusinessPerson extends Person {
	// 필드 영역
	private String company;
	private String Cnum;

	// 생성자 영역
	public BusinessPerson() {
		//super();
		System.out.println("BusinessPerson() 생성자");
	}

	// 인자있는 생성자
	public BusinessPerson(String name, String company, String age, String gender, String Cnum) {
		super(name,age,gender);
		this.company = company;
		this.Cnum = Cnum;
	}

	// 메소드 영역
	// Getters / Setters 영역
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCnum() {
		return Cnum;
	}

	public void setCnum(String cnum) {
		Cnum = cnum;
	}
	
	public void printObject() {
		System.out.println(this);
	}
	
	public void printMsg() {
		System.out.println("아픈 사람을 도와주자");
	}
	
	
	@Override
	public String toString() {

		return String.format("이름 : %s , 회사 : %s, 나이 : %s , 성별 : %s , 사원번호 : %s",
				this.getName(), this.company, this.getAge(), this.getGender(), this.Cnum);

	}

}
