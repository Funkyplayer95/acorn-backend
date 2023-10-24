package com.acorn.hunter.dto;

public class HunterTabDto {
	private int id;
	private int health;
	private int attackpower;
	private int defencepower;
	private int cash;
	private int speed;
	private int x;
	private int y;
	private int type;

	public HunterTabDto() {}
		
	public HunterTabDto(int id, int health, int attackpower, 
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

	public HunterTabDto setHealth(int health) {
		this.health = health;
		return this;
	}

	public int getAttackpower() {
		return attackpower;
	}

	public HunterTabDto setAttackpower(int attackpower) {
		this.attackpower = attackpower;
		return this;
	}

	public int getDefencepower() {
		return defencepower;
	}

	public HunterTabDto setDefencepower(int defencepower) {
		this.defencepower = defencepower;
		return this;
	}

	public int getCash() {
		return cash;
	}

	public HunterTabDto setCash(int cash) {
		this.cash = cash;
		return this;
	}

	public int getSpeed() {
		return speed;
	}

	public HunterTabDto setSpeed(int speed) {
		this.speed = speed;
		return this;
	}

	public int getX() {
		return x;
	}

	public HunterTabDto setX(int x) {
		this.x = x;
		return this;
	}

	public int getY() {
		return y;
	}

	public HunterTabDto setY(int y) {
		this.y = y;
		return this;
	}

	public int getType() {
		return type;
	}

	public HunterTabDto setType(int type) {
		this.type = type;
		return this;
	}
}
