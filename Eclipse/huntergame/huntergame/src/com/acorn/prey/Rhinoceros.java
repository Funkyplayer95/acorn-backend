package com.acorn.prey;

import com.acorn.prey.impl.PreyImpl;

public class Rhinoceros extends PreyImpl {
	
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
