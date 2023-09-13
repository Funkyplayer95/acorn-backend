package acorn_project.first_project;

public class BasketProduct extends Product{
	
	private int Num;

	public BasketProduct(Product product, int Num) {
		super(product); // '장바구니 상품'은 이전에 '상품' 이였기 때문에 이거에 대한 값을위하여 produvt 안에 product를 넣어 불러옴
		this.Num = Num;
	}
	public void setterNum(int num) {
		this.Num = num;
	}
	public int getterNum() {
		return Num;
	}
	public Long getTotalPrice() {
		return Num * super.getterPrice();
	}
    @Override
    public String toString() {
    	return String.format(super.getterProductId() 
    			+ ". "
    			+ "상품명 : " 
    			+ super.getterProductName() 
    			+ ", 가격 : " + super.getterPrice() + "원 "
    			+ this.Num +"개"
    			);
    }
	
}
