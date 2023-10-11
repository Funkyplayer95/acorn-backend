package day0828_01;

import java.util.HashMap;

public class GoodsLists {
	private HashMap<GoodsInfo, GoodsStock> objGoodsList;
	
	private Object[] objObj = new Object[5];
	
	private HashMap<Integer, HashMap<GoodsInfo, GoodsStock>> objOrderGoodsList;

	public GoodsLists() {
		objGoodsList = new HashMap<>();
		objOrderGoodsList = new HashMap<>();

		objGoodsList.put(new GoodsInfo(1,  "A상품", 2000, "A기업", "좋은상품"), 
				new GoodsStock(1,   100));
		objGoodsList.put(new GoodsInfo(2,  "B상품", 3000, "B기업", "더 좋은상품"),
				new GoodsStock(2,   200));	
	
		objGoodsList.put(new GoodsInfo(3,  "C상품", 4000, "C기업", "더더 좋은상품"),
				new GoodsStock(3,   300));

		objGoodsList.put(new GoodsInfo(4,  "D상품", 2000, "D기업", "덜 좋은상품"),
				new GoodsStock(4,   400));

		objGoodsList.put(new GoodsInfo(5,  "E상품", 3000, "E기업", "아주 좋은상품"),
				new GoodsStock(5,   500));
		
		objOrderGoodsList.put(Integer.valueOf(1), objGoodsList);
		
		System.out.println(objOrderGoodsList.get(1));
		
	}
	

	
}
