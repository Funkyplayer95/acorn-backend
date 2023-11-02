package springmvc_uitoctrl.dto;

public class Order {
	private String ordergoods; //필드 갯수와 값은 jsp의 name 값과 동일해야한다. 필수.
	private int quantity;

	public Order() {}

	public Order(String ordergoods, int quantity) {
		super();
		this.ordergoods = ordergoods;
		this.quantity = quantity;
	}

	public String getOrdergoods() {
		return ordergoods;
	}

	public void setOrdergoods(String ordergoods) {
		this.ordergoods = ordergoods;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
