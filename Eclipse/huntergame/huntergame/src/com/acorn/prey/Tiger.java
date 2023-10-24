package com.acorn.prey;

import com.acorn.prey.impl.PreyImpl;

public class Tiger extends PreyImpl {
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


