package acorn_project.second_project.jdbc_practice.jdbc_practice;

import java.util.Scanner;

public class RunMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		Login.enter(sc);
		
		sc.close();
		
		ConfigureImpl.closeConn();
	}
}
