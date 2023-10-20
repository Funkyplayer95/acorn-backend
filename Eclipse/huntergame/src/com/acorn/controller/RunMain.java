package com.acorn.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.acorn.actor.Archer;
import com.acorn.actor.Infantry;
import com.acorn.actor.Spearman;
import com.acorn.actor.impl.HunterImpl;
import com.acorn.dto.HunterTabDto;
import com.acorn.service.ActorInfoService;
import com.acorn.utils.Location;

public class RunMain {	
	private static List<HunterImpl> objHunterList = null;
	
	public static void main(String[] args) {
		actorCreator();
		gameStart();
	}
	
	private static void actorCreator() {
		// 다형성
		objHunterList = new ArrayList<HunterImpl>();
		objHunterList.add(new Archer());
		objHunterList.add(new Spearman());
		objHunterList.add(new Infantry());
		
		List<HunterTabDto> hunterTabs = getActorsInfo();
		
		for(HunterImpl objHunterChild : objHunterList) {
			if(objHunterChild instanceof Archer) {
				setActorInfo(0, objHunterChild, hunterTabs);
			} else if(objHunterChild instanceof Spearman) {
				setActorInfo(1, objHunterChild, hunterTabs);
			} else if(objHunterChild instanceof Infantry) {
				setActorInfo(2, objHunterChild, hunterTabs);
			}		
		}	
	}

	private static void setActorInfo(int actorIdx, 
			HunterImpl hunterChild, 
			List<HunterTabDto> hunterTabs) {
		hunterChild.setHealth(hunterTabs.get(actorIdx).getHealth())
		.setAttackPower(hunterTabs.get(actorIdx).getAttackpower())
		.setDefencePower(hunterTabs.get(actorIdx).getDefencepower())
		.setCash(hunterTabs.get(actorIdx).getCash())
		.setSpeed(hunterTabs.get(actorIdx).getSpeed())
		.setHealth(hunterTabs.get(actorIdx).getHealth())
		.setType(hunterTabs.get(actorIdx).getType())
		.setLocation(
			new Location(hunterTabs.get(actorIdx).getX(), 
					hunterTabs.get(actorIdx).getY()));		
	}
	
	private static void gameStart() {
		System.out.print("액터를 선택하세요: >>>");
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
		
		System.out.println("당신의 체력은: " 
				+ objSelectedActor.getHealth());
		
		sc.close();
	}
	
	private static List<HunterTabDto> getActorsInfo() {
		List<HunterTabDto> hunterTabDtosList = 
				new ActorInfoService().getUserInfo();

		return hunterTabDtosList;
	}
}

