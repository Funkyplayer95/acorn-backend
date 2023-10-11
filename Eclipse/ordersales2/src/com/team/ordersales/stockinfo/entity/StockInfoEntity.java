package com.team.ordersales.stockinfo.entity;

public class StockInfoEntity {
	private String rawmaterialname;
	private String rawmaterialqty;
	
	public StockInfoEntity() {
	}

	public StockInfoEntity(String rawmaterialname, String rawmaterialqty) {
		this.rawmaterialname = rawmaterialname;
		this.rawmaterialqty = rawmaterialqty;
	}

	public String getrawmaterialname() {
		return rawmaterialname;
	}

	public void setrawmaterialname(String rawmaterialname) {
		this.rawmaterialname = rawmaterialname;
	}

	public String getRawmaterialqty() {
		return rawmaterialqty;
	}

	public void setRawmaterialqty(String rawmaterialqty) {
		this.rawmaterialqty = rawmaterialqty;
	}
	

	
}