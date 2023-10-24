package com.acorn.prey.entity;

public class PreyTab {
	private int id;
	private int health;
	private int attackpower;
	private int defencepower;
	private int x;
	private int y;
	private int type;

	public PreyTab() {}
		
	public PreyTab(int id, int health, int attackpower, 
			int defencepower, int x, int y, int type) {
		this.id = id;
		this.health = health;
		this.attackpower = attackpower;
		this.defencepower = defencepower;
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

	public PreyTab setHealth(int health) {
		this.health = health;
		return this;
	}

	public int getAttackpower() {
		return attackpower;
	}

	public PreyTab setAttackpower(int attackpower) {
		this.attackpower = attackpower;
		return this;
	}

	public int getDefencepower() {
		return defencepower;
	}

	public PreyTab setDefencepower(int defencepower) {
		this.defencepower = defencepower;
		return this;
	}

	public int getX() {
		return x;
	}

	public PreyTab setX(int x) {
		this.x = x;
		return this;
	}

	public int getY() {
		return y;
	}

	public PreyTab setY(int y) {
		this.y = y;
		return this;
	}

	public int getType() {
		return type;
	}

	public PreyTab setType(int type) {
		this.type = type;
		return this;
	}
}
