package acorn_project;

public class Product {
    private long productId;
    private String productName;
    private long price;

    public Product(long productId, String productName, long price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    public long getProductId() { // 사용자 입장에서 코드를 짜기 때문에 getter 만 필요. setter 필요 없음.
        return productId;
    }

    public String getProductName() { // 사용자의 입장에서 코드를 짜기때문에 getter만 필요하다. setter필요없음.
        return productName;
    }

    public long getPrice() { // 사용자의 입장에서 코드를 짜기때문에 getter만 필요하다. setter필요없음.
        return price;
    }


}


