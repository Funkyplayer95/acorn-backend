package study.class_inheritancetest;

public class Test2 extends Test1{
	private int c;
	private int d;
	
	public Test2() {}
	
	public Test2(int a , int b, int c, int d) {
		super(a,b);
		this.c = c;
		this.d = d;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

	
	
	
	
	
	
	
}
