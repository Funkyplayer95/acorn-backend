package com.acorn.polyphorphism;

public class ChildDog 
	extends ParentAnimal {
	String iEatThing;
	
	public ChildDog() {	
		super(10, 5); 
		System.out.println("자식생성자1");
	}

	public ChildDog(
			String iEatThing, 
			int iWeight, int iAge) {
		super(iWeight, iAge);
		this.iEatThing = iEatThing;
		System.out.println("자식생성자2");
	}
	
	public void eat() {
		System.out.println(
				"That dog is eating " 
						+ iEatThing);
	}
}
