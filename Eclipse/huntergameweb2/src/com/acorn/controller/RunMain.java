package com.acorn.controller;

import java.util.List;
import java.util.Scanner;

import com.acorn.hunter.impl.HunterImpl;

public class RunMain {	
	private static List<HunterImpl> objHunterList = null;
	
	public static void main(String[] args) {
		gameStart();
	}	
	
	private static void gameStart() {		
		System.out.print("액터를 선택하세요: >>> ");
		Scanner sc = new Scanner(System.in);
		String selectedActor = sc.nextLine();
		HunterImpl objSelectedActor = null;
		
		int actorType = Integer.valueOf(selectedActor);
		for(HunterImpl objHunterChild : objHunterList) {
			if(objHunterChild.getType() == actorType) {
				objSelectedActor = objHunterChild;
				break;
			}
		}
		
		if(objSelectedActor.getType() == 1) {
			System.out.println("궁병을 선택하셨습니다.");
		} else if(objSelectedActor.getType() == 2) {
			System.out.println("창병을 선택하셨습니다.");
		} else if(objSelectedActor.getType() == 3) {
			System.out.println("무사를 선택하셨습니다.");
		}
		
		System.out.print("체력: " 
				+ objSelectedActor.getHealth() + ",");
		System.out.print("공격력: " 
				+ objSelectedActor.getAttackPower() + ",");
		System.out.print("방어력: " 
				+ objSelectedActor.getDefencePower() + ",");
		System.out.println("위치: (" 
				+ objSelectedActor.getLocation().getX() 
				+ "," 
				+ objSelectedActor.getLocation().getY() 
				+ ")");
		
		sc.close();
	}
}

