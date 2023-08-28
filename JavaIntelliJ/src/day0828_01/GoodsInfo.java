package day0828_01;

public class GoodsInfo {
	private int iGoodsCode;
	private String sGoodsName;
	private int iGoodsPrice;
	private String sManufactuer;
	private String sDescrption;

	public GoodsInfo() {}

	public GoodsInfo(int iGoodsCode, String sGoodsName, 
			int iGoodsPrice, String sManufactuer, 
			String sDescrption) {
		super();
		this.iGoodsCode = iGoodsCode;
		this.sGoodsName = sGoodsName;
		this.iGoodsPrice = iGoodsPrice;
		this.sManufactuer = sManufactuer;
	}

	public int getiGoodsCode() { return iGoodsCode; }
	public String getsGoodsName() { return sGoodsName; 	}
	public int getiGoodsPrice() { return iGoodsPrice; }
	public String getsManufactuer() { return sManufactuer; }
	public String getsDescrption() { return sDescrption; }

}
