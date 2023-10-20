package com.acorn.pattern;

public class MySQLDatasource extends DatabaseTemplate {

	@Override
	public void initialize() {
		System.out.println("드라이버 설정: com.mysql.jdbc.Driver");
		
	}

	@Override
	public void startDatabase() {
		System.out.println("데이터베이스 연결 : jdbc:mysql://localhost/myteam1db");
		
	}

	@Override
	public void endDatabase() {
		System.out.println("MySQL 데이터베이스 종료");
		
	}

}
