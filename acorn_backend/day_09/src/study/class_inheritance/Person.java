package study.class_inheritance;

public class Person {
	// 필드 영역
	private String name;
	private String age;
	private String gender;
	
	// 생성자 영역
	
	// 기본 생성자
	public Person() {
		System.out.println("Person() 생성자");
	}
	// 인자있는 생성자
	public Person(String name, String age, String gender) {
		System.out.println("Person() 생성자");
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	//Getters / Setters 메소드 영역
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	//오버라이드(재정의) 함수 : toString() : return "이름 : ";
	@Override  //toString 하고 Ctrl + Space 누르면 자동으로 나옴.
	public String toString() {
		return String.format("Person(name = %s , age = %s , gender = %s", this.name, this.age, this.gender);
		}
}
