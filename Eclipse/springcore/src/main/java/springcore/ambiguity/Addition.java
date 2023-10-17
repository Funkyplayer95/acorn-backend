package springcore.ambiguity;

public class Addition {
	
	public Addition(double a, double b) {
		System.out.println("DOUBLE");
	}
	
	public Addition(int a, int b) {
		System.out.println("INT");
	}	
	
	public Addition(int a, double b) {
		System.out.println("INT+DOUBLE");
	}	
	
	public Addition(double a, int b) {
		System.out.println("DOUBLE+INT");
	}
	
	public Addition(String a, String b) {
		System.out.println("STRING");
	}
}
