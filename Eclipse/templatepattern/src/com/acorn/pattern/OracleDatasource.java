package com.acorn.pattern;

public class OracleDatasource extends DatabaseTemplate {

	@Override
	public void initialize() {
		System.out.println("드라이버 설정 : oracle.jdbc.OracleDriver");
		
	}

	@Override
	public void startDatabase() {
		System.out.println("데이터베이스 연결 : jdbc:oracle:thin:@loaclhost:1521:xe");
		
	}

	@Override
	public void endDatabase() {
		System.out.println("Oracle 데이터베이스 종료");
		
	}

	
}
