package programmingbasic4;

public class RunMain {

	public static void main(String[] args) {
		GeneralClass objClass = new GeneralClass();
		System.out.println(objClass.add(10, 20));
		System.out.println(objClass.sub(10, 20));
		System.out.println(objClass.mul(10, 20));
		System.out.println(objClass.div(10, 0));
	}
}
