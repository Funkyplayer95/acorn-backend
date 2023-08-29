package acorn_project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		HashMap<Long, Product> hashProduct = new HashMap<Long, Product>();
		List<Product> categories = new ArrayList<>();

		Product foodCategory1 = new Product(1L,"물500ml 30개", 3000L, "식품");
		Product foodCategory2 = new Product(2L, "컵라면 소 6개", 6000L,"식품");
		Product foodCategory3 = new Product(3L, "컵라면 대 6개", 8000L,"식품");
		Product foodCategory4 = new Product(4L, "햅반 24개", 24000L,"식품");
		Product foodCategory5 = new Product(5L, "우유 200ml 6개", 5800L,"식품");

		hashProduct.put(foodCategory1.getterProductId(), foodCategory1);
		hashProduct.put(foodCategory2.getterProductId(), foodCategory2);
		hashProduct.put(foodCategory3.getterProductId(), foodCategory3);
		hashProduct.put(foodCategory4.getterProductId(), foodCategory4);
		hashProduct.put(foodCategory5.getterProductId(), foodCategory5);
		
		categories.add(foodCategory1);
		categories.add(foodCategory2);
		categories.add(foodCategory3);
		categories.add(foodCategory4);
		categories.add(foodCategory5);

		Product kitchenCategory1 = new Product(6L,"후라이팬 20cm 1개", 3000L, "주방용품");
		Product kitchenCategory2 = new Product(7L, "냄비 24cm 1개", 6000L,"주방용품");
		Product kitchenCategory3 = new Product(8L, "접시 5p", 8000L,"주방용품");
		Product kitchenCategory4 = new Product(9L, "수저세트 4인용", 24000L,"주방용품");

		hashProduct.put(kitchenCategory1.getterProductId(), kitchenCategory1);
		hashProduct.put(kitchenCategory2.getterProductId(), kitchenCategory2);
		hashProduct.put(kitchenCategory3.getterProductId(), kitchenCategory3);
		hashProduct.put(kitchenCategory4.getterProductId(), kitchenCategory4);
		
		categories.add(kitchenCategory1);
		categories.add(kitchenCategory2);
		categories.add(kitchenCategory3);
		categories.add(kitchenCategory4);

		Product householdCategory1 = new Product(10L,"샴푸 800ml 1개", 3000L, "생활용품");
		Product householdCategory2 = new Product(11L, "컨디셔너 500ml 1개", 6000L,"생활용품");
		Product householdCategory3 = new Product(12L,"바디워시 800ml 1개", 8000L,"생활용품");
		Product householdCategory4 = new Product(13L, "세제 2.5L 1개", 24000L,"생활용품");
		Product householdCategory5 = new Product(14L, "섬유유연제 3L 1개", 5800L,"생활용품");

		hashProduct.put(householdCategory1.getterProductId(), householdCategory1);
		hashProduct.put(householdCategory2.getterProductId(), householdCategory2);
		hashProduct.put(householdCategory3.getterProductId(), householdCategory3);
		hashProduct.put(householdCategory4.getterProductId(), householdCategory4);
		hashProduct.put(householdCategory5.getterProductId(), householdCategory5);
		
		categories.add(householdCategory1);
		categories.add(householdCategory2);
		categories.add(householdCategory3);
		categories.add(householdCategory4);
		categories.add(householdCategory5);

		System.out.println(foodCategory1);
		Scanner sc = new Scanner(System.in);

		// 사용자 정보 입력창 (초기 한 번)
		System.out.print("이름 입력 : ");  String name = sc.nextLine();
		System.out.print("폰 번호 입력 : "); String phone = sc.nextLine();
		System.out.print("주소 입력 : "); String addr = sc.nextLine();
		Member member = new Member(1L, name, phone, addr);
		System.out.println("계정 생성 완료");


		while (true) {
			// 메인 메뉴 
			System.out.println("==========메뉴==========");
			System.out.println("1. 장바구니 ");
			System.out.println("2. 상품");
			System.out.println("0. 종료");
			System.out.println("========================");
			System.out.print("입력 >> ");
			int mainScNum = Integer.parseInt(sc.nextLine());
			if(mainScNum == 0 ) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

			// 메뉴 1. 장바구니 선택 
			else if(mainScNum == 1) {
				int basketScNum;
				while(true) {
					System.out.println("========장바구니 목록=========");
					member.getBasket().BasketRead();
					System.out.println("===========================");
					System.out.print("1. 장바구니 목록 삭제 2. 주문하기 (0: 뒤로가기): ");
					basketScNum = Integer.parseInt(sc.nextLine());

					if(basketScNum == 0) {
						System.out.println("메인으로 돌아갑니다.");
						break;
					}
					else if(basketScNum ==1) {
						System.out.print("삭제할 품목ID를 입력해주세요 : ");
						member.getBasket().BasketDelete(Long.parseLong(sc.nextLine()));
					}
					else if(basketScNum ==2) {
						member.orderCheck(sc);
						break;
					}
				}
			}		

			// 메뉴 2. 상품 선택 
			else if(mainScNum == 2) {
				int productScNum;
				while(true) {
					System.out.print("카테고리를 선택하세요 (1: 식품, 2: 주방용품, 3: 생활용품, 0: 뒤로가기): ");
					productScNum = Integer.parseInt(sc.nextLine());
					if(productScNum == 0) {
						System.out.println("메인으로 돌아갑니다. ");
						break;
					}
					else if(productScNum == 1) {
						System.out.println("========식품 목록========");
						for(Product pd : categories) {
							pd.getCategory("식품");
						}
						System.out.println("========================");
						System.out.print("장바구니에 넣을 상품ID를 입력하세요 : ");
						Long productNum = Long.parseLong(sc.nextLine());
						member.getBasket().BasketAdd(hashProduct.get(productNum), sc);
						continue;
					}
					else if(productScNum == 2) {
						System.out.println("========주방용품 목록========");
						for(Product pd : categories) {
							pd.getCategory("주방용품");
						}
						System.out.println("=========================");
						System.out.print("장바구니에 넣을 상품ID를 입력하세요 : ");
						Long productNum = Long.parseLong(sc.nextLine());
						member.getBasket().BasketAdd(hashProduct.get(productNum), sc);
						continue;
					}
					else if(productScNum == 3) {
						System.out.println("========생활용품 목록=========");
						for(Product pd : categories) {
							pd.getCategory("생활용품");
						}
						System.out.println("===========================");
						System.out.print("장바구니에 넣을 상품ID를 입력하세요 : ");
						Long productNum = Long.parseLong(sc.nextLine());
						member.getBasket().BasketAdd(hashProduct.get(productNum), sc);
						continue;
					}
					
				}
			}
		}
		sc.close();
	}
}