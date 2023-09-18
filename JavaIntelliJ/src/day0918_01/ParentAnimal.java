package com.acorn.polyphorphism;

public class ParentAnimal {
	int iWeight;
	int iAge;

	public ParentAnimal() { 
		System.out.println("부모생성자1");
	}
	public ParentAnimal(
			int iWeight, int iAge) {
		System.out.println("부모생성자2");
		this.iWeight = iWeight;
		this.iAge = iAge;
	}
	
	public void run() {
		System.out.println("run()");
	}
	
	@Override
	public String toString() {
		return "몸무게: " 
				+ iWeight 
				+ ", 나이: " 
				+ iAge;
	}
}
