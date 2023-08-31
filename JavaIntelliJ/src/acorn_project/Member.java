package acorn_project;

import java.util.Scanner;

public class Member { 
	private long id;
	private String name;
	private String phone; 
	private String addr;
	private String deliveryAddr;
	private Basket basket;

	public Member() {}

	public Member(long id, String name,
			String phone, String addr) {
		this.id = id; // main부분에서 구현
		this.name = name; // main부분에서 구현
		this.phone = phone; // main부분에서 구현
		this.addr = addr; // main부분에서 구현
		this.deliveryAddr = addr; //배송지 변경을 위해
		this.basket = new Basket(); // 장바구니 리스트,토탈금액 을 불러오기위해
	}
	// 배송지 변경창
	public void updateDeliveryAddr(Scanner sc){
		// 안내문구 출력
		System.out.println("변경될 배송지를 입력 해주세요. >>"); 
		// 배송지 String으로 입력받기
		String updateAddr = sc.nextLine(); 
		setdeliveryAddr(updateAddr);
		// 변경완료문구
		System.out.println("배송지 변경 완료!");

	}

	// 주문 확인창 1.주문완료하시겠습니까? 2.배송지변경하시겠습니까? 3.뒤로가기.
	public void orderCheck(Scanner sc){
		while(true) {
			// 주문 정보 안내 문구
			System.out.println("====================");
			System.out.println("주문 정보를 확인해주세요."); 
			System.out.println("====================");
			//장바구니에 담은 hashmap 불러오기
			basket.BasketRead();
			System.out.println("총 가격 :" + basket.BasketTotalPrice());
			System.out.println("배송지 : " + deliveryAddr);
			System.out.println("====================");
			System.out.println("1. 주문 완료");
			System.out.println("2. 배송지 변경");
			System.out.println("99. 뒤로가기");
			System.out.print("입력 >> ");

			int num = Integer.parseInt(sc.nextLine());
			if(num == 99) {
				System.out.println("뒤로 갑니다.");
				break;
			}
			else if (num == 1) {
				System.out.print("주문을 완료하시겠습니까? (Y/N) >>");
				// Y/N으로 입력받기.
				String finsh = sc.nextLine(); 
				// Y로 입력을 받는다면
				if (finsh.equalsIgnoreCase("Y")) { 
					orderComplete();
					break;
				}
				// N으로 입력 받는다면
				else if (finsh.equalsIgnoreCase("N")) { 
					System.out.println("전 단계로 돌아갑니다.");
					continue;
				} 
				// 다른 문자를 받는다면
				else { 
					System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
					continue; // while문 다시 실행.
				}
			}
			else if (num == 2){
				updateDeliveryAddr(sc);
				continue;
			}
			else {// 다른 문자를 받는다면
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
				continue; // while문 다시 실행.
			}
		}
	}
	public void orderComplete(){ // 주문 완료창

		System.out.println("주문을 완료하였습니다!");
		System.out.println("곧 배송을 시작 합니다.");

		// 주문 완료, 프로그램 실행 종료.
	}
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getPhone() {
		return phone;
	}
	public String getAddr() {
		return addr;
	}
	public String getdeliveryAddr() {
		return deliveryAddr;
	}
	public Basket getBasket() {
		return basket;
	}
	public void setdeliveryAddr(String deliveryAddr) {
		this.deliveryAddr = deliveryAddr;
	}

}

