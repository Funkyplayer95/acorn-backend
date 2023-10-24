package com.acorn.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.acorn.hunter.Archer;
import com.acorn.hunter.Infantry;
import com.acorn.hunter.Spearman;
import com.acorn.hunter.dto.HunterTabDto;
import com.acorn.hunter.impl.HunterImpl;
import com.acorn.hunter.service.HunterInfoService;
import com.acorn.prey.Rhinoceros;
import com.acorn.prey.Sheep;
import com.acorn.prey.Tiger;
import com.acorn.prey.dto.PreyTabDto;
import com.acorn.prey.impl.PreyImpl;
import com.acorn.prey.service.PreyInfoService;
import com.acorn.utils.Location;

public class RunMain {	
	private static List<HunterImpl> objHunterList = null;
	private static List<PreyImpl> objPreyList = null;
	
	public static void main(String[] args) {
		preyCreator();
		hunterCreator();
		gameStart();
	}
	
	private static void preyCreator() {
		// 다형성
		objPreyList = new ArrayList<PreyImpl>();
		objPreyList.add(new Tiger());
		objPreyList.add(new Rhinoceros());
		objPreyList.add(new Sheep());		
		
		List<PreyTabDto> preyTabs = getPreysInfo();
		
		for(PreyImpl objpreyChild : objPreyList) {
			if(objpreyChild instanceof Tiger) {
				setPreyInfo(0, objpreyChild, preyTabs);
			} else if(objpreyChild instanceof Rhinoceros) {
				setPreyInfo(1, objpreyChild, preyTabs);
			} else if(objpreyChild instanceof Sheep) {
				setPreyInfo(2, objpreyChild, preyTabs);
			}		
		}	
	}		

	private static void hunterCreator() {
		// 다형성
		objHunterList = new ArrayList<HunterImpl>();
		HunterImpl hi1 = new Archer();
		objHunterList.add(hi1);
		objHunterList.add(new Spearman());
		objHunterList.add(new Infantry());		
		
		List<HunterTabDto> hunterTabs = getHuntersInfo();
		
		for(HunterImpl objHunterChild : objHunterList) {
			if(objHunterChild instanceof Archer) {
				setHunterInfo(0, objHunterChild, hunterTabs);
			} else if(objHunterChild instanceof Spearman) {
				setHunterInfo(1, objHunterChild, hunterTabs);
			} else if(objHunterChild instanceof Infantry) {
				setHunterInfo(2, objHunterChild, hunterTabs);
			}		
		}	
	}

	/***
	 * 
	 * @param actorIdx : 자식 객체의 인덱스
	 * @param hunterChild: 생성한 자식객체(다형성)
	 * @param hunterTabs: 액터 정보 리스트(데이터베이스에서 추출한)
	 * description: 
	 */
	private static void setHunterInfo(int actorIdx, 
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
	
	private static void setPreyInfo(int actorIdx, 
			PreyImpl preyChild, 
			List<PreyTabDto> preyTabs) {
		preyChild.setHealth(preyTabs.get(actorIdx).getHealth())
		.setDefencePower(preyTabs.get(actorIdx).getDefencepower())
		.setLocation(
			new Location(preyTabs.get(actorIdx).getX(), 
					preyTabs.get(actorIdx).getY()));		
	}
	
	private static void gameStart() {
		// prey 정보 출력
		System.out.println("=== 생성된 사냥감들 ===");
		for(PreyImpl objpreyChild : objPreyList) {
			if(objpreyChild instanceof Tiger) {
				System.out.print("호랑이 >>> ");
				System.out.print("체력:" 
						+ objpreyChild.getHealth() 
					+ " , ");
				System.out.print("방어력:" 
						+ objpreyChild.getDefencePower() 
						+ " , ");
				System.out.println("위치:" 
						+ "(" 
						+ objpreyChild.getLocation().getX() 
						+ "," + objpreyChild.getLocation().getY() 
						+ ")");
			} else if(objpreyChild instanceof Rhinoceros) {
				System.out.print("코뿔소 >>> ");
				System.out.print("체력:" 
						+ objpreyChild.getHealth() 
						+ " , ");
				System.out.print("방어력:" 
						+ objpreyChild.getDefencePower() 
						+ " , ");
				System.out.println("위치:" 
						+ "(" 
						+ objpreyChild.getLocation().getX() 
						+ "," + objpreyChild.getLocation().getY() 
						+ ")");			
			} else if(objpreyChild instanceof Sheep) {
				System.out.print("양 >>> ");
				System.out.print("체력:" 
						+ objpreyChild.getHealth() 
						+ " , ");
				System.out.print("방어력:" 
						+ objpreyChild.getDefencePower() 
						+ " , ");
				System.out.println("위치:" 
						+ "(" + objpreyChild.getLocation().getX() 
						+ "," + objpreyChild.getLocation().getY() 
						+ ")");
				System.out.println();
			}
		}
		
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
	
	private static List<HunterTabDto> getHuntersInfo() {
		List<HunterTabDto> hunterTabDtosList = 
				new HunterInfoService().getHunterInfo();

		return hunterTabDtosList;
	}
	
	private static List<PreyTabDto> getPreysInfo() {
		List<PreyTabDto> preyTabDtosList = 
				new PreyInfoService().getPreyInfo();

		return preyTabDtosList;
	}
}

