package com.acorn.polyphorphism;

public class RunMain {

	public static void main(String[] args) {
		// 다형성
		ParentAnimal parentAnimal = 
				new ChildDog("Gum", 12, 8);
		parentAnimal.run();
		((ChildDog)parentAnimal).eat();;	
		
		// Cast: 한 타입을 다른 타입으로 변경
		// 명시적 타입변환
		// 암시적(자동적) 타입변환
		int iValue = 10;	// 4바이트
		long lValue = 10;   // 8바이트
//		iValue = lValue;   // 이유는?
		iValue = (int)lValue;
		lValue = iValue;
		

	}

}
