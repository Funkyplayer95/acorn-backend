package com.acron.java1;

import java.util.ArrayList;
import java.util.List;

public class array {

	public static void main(String[] args) {
		
		List<Object> arrayList = new ArrayList<>();
		
		for (int i = 0; i < 6; i++) {
			arrayList.add(i+"번째");
		}
		System.out.println(arrayList);
	}

}
