package com.acorn._interface;

public class Main01 {

	public static void main(String[] args) {
		DatabaseMoudule db = 
				new OracleDatabaseMoudule();
		int iRet = db.insert("test");
		System.out.println(iRet);
		
		System.out.println("=====================");
		
		String sRet = db.select();
		System.out.println(sRet);
		
		System.out.println(DatabaseMoudule.DB_VERSION);
		
		System.out.println("=====================");
		
		System.out.println(DatabaseMoudule.add(1, 2));
		
		int iRet2 = db.add(1,  2, 3);
		System.out.println(iRet2);
	}

}
