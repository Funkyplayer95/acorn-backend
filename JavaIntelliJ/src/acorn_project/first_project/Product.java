package acorn_project.first_project;

public class Product {

    private  Long ProductId;
    private  String ProductName;
    private  Long Price;
    private String Category;

    public Product() {
    }
    public Product(Long productId, String productName, //원래는 관리자 한테만 있는 메소드다. 생성자.
    		Long price, String Category) {
		this.ProductId = productId;
		this.ProductName = productName;
		this.Price = price;
		this.Category = Category;
	}
	public Product(Product product) { // BasketProduct에 값을 넣어주기위해 product 안에 product를 넣었다. 중요;
    	this.ProductId =product.getterProductId();
    	this.ProductName =product.getterProductName();
    	this.Price =product.getterPrice();
    	this.Category = product.getterCategory();
    }
    public Long getterProductId() {
    	return ProductId;
    }
    public String getterProductName() {
    	return ProductName;
    }
    public Long getterPrice() {
    	return Price;
    }
    public String getterCategory() {
    	return Category;
    }
    public void getCategory(String category) {
    	if(this.Category.equals(category)) {
    		System.out.println(this.ProductId + ". "
    			+"상품명 : " 
    			+ this.ProductName 
    			+ ", 가격 : " + this.Price + "원");
    	}
    }
    
    @Override
    public String toString() {
    	return String.format(this.ProductId + ". "
    			+"상품명 : "
    			+ this.ProductName
    			+ ", 가격 : " + this.Price + "원"
    			);

    }

}