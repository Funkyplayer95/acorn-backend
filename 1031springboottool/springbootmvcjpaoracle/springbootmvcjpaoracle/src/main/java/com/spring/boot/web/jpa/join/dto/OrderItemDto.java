package com.spring.boot.web.jpa.join.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderItemDto implements ReturnDataList{
	private int order_item_id;
	private int count;
	private int order_price;
	private int item_id;
	private int order_id;	
}
