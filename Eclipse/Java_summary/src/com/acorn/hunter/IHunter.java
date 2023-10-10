package com.acorn.hunter;

public interface IHunter {
    //1. 상수
//	public final static String NAME = "Hunter";
	
	//2. 추상 메소드
	void wake (int basichealth);
    void walk (int speed);
    void run (int speed);
    void attack (int attackpower);
    void defence (int defencepower);
    void sleep (int basichealth);
    void die ();
}
