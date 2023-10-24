package com.acorn.prey;

public interface IPrey {
	void walk(int speed);
	void run(int speed);
	void attack(int attackPower);
	void defence(int defencePower);
	void die();
}
