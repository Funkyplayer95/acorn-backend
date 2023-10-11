package day0828_01;

public class GoodsStock{
	private int iGoodsCode;
	private int iGoodsQuentity;
	
	public GoodsStock() {}
	
	public GoodsStock(int iGoodsCode, 
			int iGoodsQuentity) {
		this.iGoodsCode = iGoodsCode;
		this.iGoodsQuentity = iGoodsQuentity;
	}

	public int getiGoodsCode() { 
		return iGoodsCode; 	
	}

	public int getiGoodsQuentity() {
		return iGoodsQuentity;
	}


	
	
	
}
