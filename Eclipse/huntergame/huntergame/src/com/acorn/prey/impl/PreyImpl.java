package com.acorn.prey.impl;

import com.acorn.prey.IPrey;
import com.acorn.utils.Location;

public class PreyImpl implements IPrey {
	private int health;
	private int attackPower;
	private int defencePower;
	private int type;
	private Location location;

	@Override
	public void walk(int speed) {
		System.out.println("P:wake()");
	}

	@Override
	public void run(int speed) {
		System.out.println("P:wake()");
	}

	@Override
	public void attack(int attackPower) {
		System.out.println("P:wake()");
	}

	@Override
	public void defence(int defencePower) {
		System.out.println("P:defence()");
	}

	@Override
	public void die() {
		System.out.println("P:die()");
	}

	public int getHealth() {
		return health;
	}

	public PreyImpl setHealth(int health) {
		this.health = health;
		return this;
	}

	public int getAttackPower() {
		return attackPower;
	}

	public PreyImpl setAttackPower(int attackPower) {
		this.attackPower = attackPower;
		return this;
	}

	public int getDefencePower() {
		return defencePower;
	}

	public PreyImpl setDefencePower(int defencePower) {
		this.defencePower = defencePower;
		return this;
	}

	public int getType() {
		return type;
	}

	public PreyImpl setType(int type) {
		this.type = type;
		return this;
	}
	
	public Location getLocation() {
		return location;
	}

	public PreyImpl setLocation(Location location) {
		this.location = location;
		return this;
	}
}
