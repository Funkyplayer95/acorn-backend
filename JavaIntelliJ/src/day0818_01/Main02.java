package day0818_01;


// 상수: 초기화 한번만 가능
// 상수: final 데이터타입 상수명 = 초기값
// 상수명: 대문자로 만듬.
public class Main02 {

	public static void main(String[] args) {
		Child child = new Child();
        System.out.println(child.getChild01());
        System.out.println(child.getParent01());
        System.out.println(child.getParent02());

        Child child1 = new Child(20,10,30);
        System.out.println(child.getChild01());
        System.out.println(child.getParent01());
        System.out.println(child.getParent02());
	}

}
