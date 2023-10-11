package day0822_01;

import java.util.Scanner;

public class SnackMenu {
	private Scanner sc;
	private SnackController snackControler;
		
	public void menu() {
		sc = new Scanner(System.in);
		snackControler = new SnackController();
		// 스낵류를 입력하세요
		// 종류:
		// 이름:
		// 맛:
		// 개수:
		// 가격:
		snackControler.saveData(null, null, null, 0, 0);
	}
}
