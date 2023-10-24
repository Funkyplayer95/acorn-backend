package com.acorn.prey.dto;

public class PreyTabDto {
	private int health;
	private int defencepower;
	private int x;
	private int y;

	public PreyTabDto() {}
		
	public PreyTabDto(int health, int defencepower, 
			int x, int y) {
		this.health = health;
		this.defencepower = defencepower;
		this.x = x;
		this.y = y;
	}
	
	public int getHealth() {
		return health;
	}

	public PreyTabDto setHealth(int health) {
		this.health = health;
		return this;
	}

	public int getDefencepower() {
		return defencepower;
	}

	public PreyTabDto setDefencepower(int defencepower) {
		this.defencepower = defencepower;
		return this;
	}

	public int getX() {
		return x;
	}

	public PreyTabDto setX(int x) {
		this.x = x;
		return this;
	}

	public int getY() {
		return y;
	}

	public PreyTabDto setY(int y) {
		this.y = y;
		return this;
	}
}
