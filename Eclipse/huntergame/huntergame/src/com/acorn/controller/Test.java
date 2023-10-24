package com.acorn.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.acorn.hunter.Archer;
import com.acorn.hunter.Infantry;
import com.acorn.hunter.Spearman;
import com.acorn.hunter.entity.HunterTab;
import com.acorn.hunter.impl.HunterImpl;

public class Test {
	private static List<HunterImpl> objHunterList = null;
	private final static String DB_URL =
			"jdbc:oracle:thin:@localhost:1521:xe";
	private final static String USER = "kht123";
	private final static String PASS = "kht123";
	
	public static void main(String[] args) {
		objHunterList = new ArrayList<HunterImpl>();	
		objHunterList.add(new Archer());
		objHunterList.add(new Spearman());
		objHunterList.add(new Infantry());
		
		List<HunterTab> hunterTabsList = 
				new ArrayList<HunterTab>();
		String sql = "SELECT id, health, attackpower,"
				+ "defencepower, cash, speed, x, y,"
				+ "type FROM huntertab";
			
		Connection 	conn 			= null;
		PreparedStatement pstmt 	= null;
		ResultSet 	rs 				= null;
			
		HunterTab hunterTab			= null;
			
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
			
		try {
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();				
				
			while(rs.next()) {
				hunterTab = new HunterTab();
					
				hunterTab.setId(rs.getInt("id"));
				hunterTab.setHealth(rs.getInt("health"));
				hunterTab.setAttackpower(rs.getInt("attackpower"));
				hunterTab.setDefencepower(rs.getInt("defencepower"));
				hunterTab.setCash(rs.getInt("cash"));
				hunterTab.setSpeed(rs.getInt("speed"));
				hunterTab.setX(rs.getInt("x"));
				hunterTab.setY(rs.getInt("y"));
				hunterTab.setType(rs.getInt("type"));

				hunterTabsList.add(hunterTab);
				hunterTab = null;
			}
				
			rs.close();
			pstmt.close();
			conn.close();
				
		} catch (SQLException e) {
				e.printStackTrace();
		}				
		
		for(HunterImpl objHunterChild : objHunterList) {
			if(objHunterChild instanceof Archer) {
				objHunterChild.setHealth((hunterTabsList.get(0)).getHealth());
			} else if(objHunterChild instanceof Spearman) {

			} else if(objHunterChild instanceof Infantry) {

			}		
		}
		
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
		objSelectedActor.run(objSelectedActor.getSpeed());
		
		sc.close();	
	}
}
