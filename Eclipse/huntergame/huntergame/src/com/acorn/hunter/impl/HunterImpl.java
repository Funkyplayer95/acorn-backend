package com.acorn.hunter.impl;

import com.acorn.hunter.IHunter;
import com.acorn.utils.Location;

public class HunterImpl implements IHunter {
	private int health;
	private int attackPower;
	private int defencePower;
	private int cash;
	private int speed;
	private int type;
	private Location location;

	@Override
	public void wake(int basicHealth) {
		System.out.println("P:wake()");
	}

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
	public void sleep(int basicHealth) {
		System.out.println("P:sleep()");
	}

	@Override
	public void die() {
		System.out.println("P:die()");
	}

	public int getHealth() {
		return health;
	}

	public HunterImpl setHealth(int health) {
		this.health = health;
		return this;
	}

	public int getAttackPower() {
		return attackPower;
	}

	public HunterImpl setAttackPower(int attackPower) {
		this.attackPower = attackPower;
		return this;
	}

	public int getDefencePower() {
		return defencePower;
	}

	public HunterImpl setDefencePower(int defencePower) {
		this.defencePower = defencePower;
		return this;
	}

	public int getCash() {
		return cash;
	}

	public HunterImpl setCash(int cash) {
		this.cash = cash;
		return this;
	}

	public int getSpeed() {
		return speed;
	}

	public HunterImpl setSpeed(int speed) {
		this.speed = speed;
		return this;
	}

	public Location getLocation() {
		return location;
	}

	public HunterImpl setLocation(Location location) {
		this.location = location;
		return this;
	}

	public int getType() {
		return type;
	}

	public HunterImpl setType(int type) {
		this.type = type;
		return this;
	}
}
