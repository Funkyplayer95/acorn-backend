package com.spring.boot.web.jpa.join.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.boot.web.jpa.join.dto.MemberDto;
import com.spring.boot.web.jpa.join.dto.OrderItemDto;
import com.spring.boot.web.jpa.join.dto.OrdersDto;
import com.spring.boot.web.jpa.join.dto.ReturnDataList;
import com.spring.boot.web.jpa.join.service.OrdersService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class OrdersController {
	
	private final OrdersService ordersService;
	
	@GetMapping(value = "/getOrderInfo")
	public String findById(@RequestParam("id") String id, 
			ModelMap modelMap) {
		List<ReturnDataList> returnDataLists =
				ordersService.getOrderAndOthersList(Integer.valueOf(id));
		System.out.println("리턴사이즈: " + returnDataLists.size());
		
		MemberDto memberDto = (MemberDto)returnDataLists.get(0);
		OrdersDto ordersDto = (OrdersDto)returnDataLists.get(1);
		
		List<OrderItemDto> orderItemDtosList = new ArrayList<OrderItemDto>();
		for(int i = 2; i < returnDataLists.size(); i++) {
			orderItemDtosList.add((OrderItemDto)returnDataLists.get(i));
		}
		
		modelMap.addAttribute("member", memberDto);
		modelMap.addAttribute("orders", ordersDto);
		modelMap.addAttribute("orderitemlist", orderItemDtosList);
		modelMap.addAttribute("msg", "조회 성공");
		
		return "orderMultiView";
	}
}
