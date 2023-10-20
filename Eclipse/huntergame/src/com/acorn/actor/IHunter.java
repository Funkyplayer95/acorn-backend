package com.acorn.actor;

public interface IHunter {
	void wake(int basicHealth);
	void walk(int speed);
	void run(int speed);
	void attack(int attackPower);
	void defence(int defencePower);
	void sleep(int basicHealth);
	void die();
}
