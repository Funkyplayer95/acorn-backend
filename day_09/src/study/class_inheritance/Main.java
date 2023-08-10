package study.class_inheritance;

public class Main {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		System.out.println(p1);
		System.out.println(p1.toString());
		
		Person p2 = new Person("직원1","29","남자");
		System.out.println(p2.toString());
		
		BusinessPerson b1 = new BusinessPerson();
		System.out.println(b1);
		BusinessPerson b2 = new BusinessPerson("직원2","에이콘","29","남","4885");
		System.out.println(b2);
	}

}
