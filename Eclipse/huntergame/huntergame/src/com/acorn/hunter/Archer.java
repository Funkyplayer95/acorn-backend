package com.acorn.hunter;

import com.acorn.hunter.impl.HunterImpl;

public class Archer extends HunterImpl {
	
	@Override
	public void walk(int speed) {
		System.out.println("C:Archer:wake()");
	}

	@Override
	public void run(int speed) {
		System.out.println("C:Archer:run()");
	}

	@Override
	public void attack(int attackPower) {
		System.out.println("C:Archer:attack()");
	}

	@Override
	public void defence(int defencePower) {
		System.out.println("C:Archer:defence()");
	}
}
