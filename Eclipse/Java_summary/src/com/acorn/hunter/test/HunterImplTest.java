package com.acorn.hunter.test;

import com.acorn.common.Location;
import com.acorn.hunter.HunterImpl;

// 데이터 보안(Data encapsulation) / 상속 가능 (inheritance)  / 다형성 가능 (polymorphism)
public class HunterImplTest {

	public static void main(String[] args) {
		HunterImpl hunterImpl = new HunterImpl();
		hunterImpl.wake(100);
		
		Location location = new Location();
		hunterImpl = new HunterImpl(100,20,10,5000,30, location);
		System.out.println("x : " + hunterImpl.location.getX() + " , y : " + hunterImpl.location.getY());

	}

}
