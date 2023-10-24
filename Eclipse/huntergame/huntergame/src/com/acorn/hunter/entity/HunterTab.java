package com.acorn.hunter.entity;

public class HunterTab {
	private int id;
	private int health;
	private int attackpower;
	private int defencepower;
	private int cash;
	private int speed;
	private int x;
	private int y;
	private int type;

	public HunterTab() {}
		
	public HunterTab(int id, int health, int attackpower, 
			int defencepower, int cash, int speed, 
			int x, int y, int type) {
		this.id = id;
		this.health = health;
		this.attackpower = attackpower;
		this.defencepower = defencepower;
		this.cash = cash;
		this.speed = speed;
		this.x = x;
		this.y = y;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getHealth() {
		return health;
	}

	public HunterTab setHealth(int health) {
		this.health = health;
		return this;
	}

	public int getAttackpower() {
		return attackpower;
	}

	public HunterTab setAttackpower(int attackpower) {
		this.attackpower = attackpower;
		return this;
	}

	public int getDefencepower() {
		return defencepower;
	}

	public HunterTab setDefencepower(int defencepower) {
		this.defencepower = defencepower;
		return this;
	}

	public int getCash() {
		return cash;
	}

	public HunterTab setCash(int cash) {
		this.cash = cash;
		return this;
	}

	public int getSpeed() {
		return speed;
	}

	public HunterTab setSpeed(int speed) {
		this.speed = speed;
		return this;
	}

	public int getX() {
		return x;
	}

	public HunterTab setX(int x) {
		this.x = x;
		return this;
	}

	public int getY() {
		return y;
	}

	public HunterTab setY(int y) {
		this.y = y;
		return this;
	}

	public int getType() {
		return type;
	}

	public HunterTab setType(int type) {
		this.type = type;
		return this;
	}
}
