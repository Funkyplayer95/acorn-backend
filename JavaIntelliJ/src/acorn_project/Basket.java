package acorn_project;

import java.util.HashMap;
import java.util.Scanner;

public class Basket {


    private  HashMap<Long, BasketProduct> hashProduct
     = new HashMap<Long, BasketProduct>();
    
    
    // 장바구니 목록을 모두 띄움
    public void BasketRead() {
    	if(hashProduct != null) {
    		for(Long key : hashProduct.keySet()) {
        		System.out.println(hashProduct.get(key).toString());
        	}
    	}else {
    		System.out.println("장바구니가 터엉~");
    	}
    	
    }
    // 사용자가 상품을 선택했을 때 장바구니에 추가하는 메서드
    public void BasketAdd(Product product, Scanner sc) {
    	System.out.print("개수 입력 : ");
    	int num = Integer.parseInt(sc.nextLine());
    	hashProduct.put(product.getterProductId(), 
    			new BasketProduct(product, num));
    	
    	System.out.println("선택하신 품목이 추가되었습니다.");
    }
    // 사용자가 장바구니에서 특정 품목을 삭제하는 메서드
    public void BasketDelete(Long key) {
    	System.out.println(hashProduct.get(key).toString() +
    			" -> 삭제합니다. ");
    	hashProduct.keySet().remove(key);
    	System.out.println("삭제 완료했습니다.");
    }
    // OrderCheck() 메서드에서 사용할 것
    // 장바구니 품목의 모든 가격을 계산해서 반환해줌 
    // type -> Long
    public Long BasketTotalPrice() {
    	Long totalPrice = 0L;
    	for(Long key : hashProduct.keySet()) {
    		totalPrice += hashProduct.get(key).getTotalPrice();
    	}
    	return totalPrice;
    }


}