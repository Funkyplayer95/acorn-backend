package com.acorn.prey;

import com.acorn.prey.impl.PreyImpl;

public class Sheep extends PreyImpl {
	
	@Override
	public void walk(int speed) {
		System.out.println("C:Spearman:wake()");
	}

	@Override
	public void run(int speed) {
		System.out.println("C:Spearman:run()");
	}

	@Override
	public void attack(int attackPower) {
		System.out.println("C:Spearman:attack()");
	}

	@Override
	public void defence(int defencePower) {
		System.out.println("C:Spearman:defence()");
	}
}
