package com.jinbay.myapp.sales.dto;

public class InsalesRegisterDto {
	private int seq;
	private String goodsCode;
	private String goodsName;
	private String rawMaterialCode;
	private int RAWMATERIALQTY;
	
	public InsalesRegisterDto() {}
	
	public InsalesRegisterDto(int seq, String goodsCode, String goodsName, 
			String rawMaterialCode, int RAWMATERIALQTY) {
		this.seq = seq;
		this.goodsCode = goodsCode;
		this.goodsName = goodsName;
		this.rawMaterialCode = rawMaterialCode;
		this.RAWMATERIALQTY = RAWMATERIALQTY;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getGoodsCode() {
		return goodsCode;
	}

	public void setGoodsCode(String goodsCode) {
		this.goodsCode = goodsCode;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getRawMaterialCode() {
		return rawMaterialCode;
	}

	public void setRawMaterialCode(String rawMaterialCode) {
		this.rawMaterialCode = rawMaterialCode;
	}

	public int getRAWMATERIALQTY() {
		return RAWMATERIALQTY;
	}

	public void setRAWMATERIALQTY(int RAWMATERIALQTY) {
		this.RAWMATERIALQTY = RAWMATERIALQTY;
	}

}