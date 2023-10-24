package com.acorn.hunter;

import com.acorn.hunter.impl.HunterImpl;

public class Infantry extends HunterImpl {
	
	@Override
	public void walk(int speed) {
		System.out.println("C:Infantry:wake()");
	}

	@Override
	public void run(int speed) {
		System.out.println("C:Infantry:run()");
	}

	@Override
	public void attack(int attackPower) {
		System.out.println("C:Infantry:attack()");
	}

	@Override
	public void defence(int defencePower) {
		System.out.println("C:Infantry:defence()");
	}
}
