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
public class OrdersDto implements ReturnDataList {
	private int order_id;
	private String order_status;
	private int member_id;
}
