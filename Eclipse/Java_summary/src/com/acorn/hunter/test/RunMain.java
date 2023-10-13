package com.acorn.hunter.test;

import java.util.ArrayList;
import java.util.List;

import com.acorn.hunter.Archer;
import com.acorn.hunter.HunterImpl;
import com.acorn.hunter.Infantry;
import com.acorn.hunter.Spearman;


public class RunMain {

	public static void main(String[] args) {
		
		List<HunterImpl> objHunterList = new ArrayList<HunterImpl>();
		objHunterList.add(new Archer());
		objHunterList.add(new Spearman());
		objHunterList.add(new Infantry());
		
		objHunterList.get(0).setHealth(60);
		objHunterList.get(0).setAttackpower(90);
		objHunterList.get(0).setDefencepower(50);
		objHunterList.get(0).wake(60);
		
		
		objHunterList.get(1).setHealth(100);
		objHunterList.get(1).setAttackpower(70);
		objHunterList.get(1).setDefencepower(100);
		objHunterList.get(1).wake(100);
		
		
		objHunterList.get(2).setHealth(80);
		objHunterList.get(2).setAttackpower(80);
		objHunterList.get(2).setDefencepower(70);
		objHunterList.get(2).wake(80);
	}

}
