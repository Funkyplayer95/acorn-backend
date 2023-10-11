package day0818_01;

public class Parent {
	private int parent01;
	private int parent02;
	
	public Parent() {}
	public Parent(int parent01, int parent02) {
		this.parent01 = parent01;
		this.parent02 = parent02;
	}
	
	public int getParent01() { return parent01; }
	public void setParent01(int parent01) {
		this.parent01 = parent01;
	}

	public int getParent02() { return parent02; }
	public void setParent02(int parent02) {
		this.parent02 = parent02;
	}
	
	public void printObj()
	{
		System.out.println("parent01:" + parent01 
				+ " " + "parent01:" + parent02);
	}
}
