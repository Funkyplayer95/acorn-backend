package com.spring.boot.web.jpa.join.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.spring.boot.web.jpa.join.dto.MemberDto;
import com.spring.boot.web.jpa.join.dto.OrderItemDto;
import com.spring.boot.web.jpa.join.dto.OrdersDto;
import com.spring.boot.web.jpa.join.dto.ReturnDataList;
import com.spring.boot.web.jpa.join.entity.Member;
import com.spring.boot.web.jpa.join.entity.OrderItem;
import com.spring.boot.web.jpa.join.entity.Orders;
import com.spring.boot.web.jpa.join.repository.OrdersRepository;

import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class OrdersService {
	
	private final OrdersRepository ordersRepository;
	
	public List<ReturnDataList> getOrderAndOthersList(int id) {
		List<ReturnDataList> returnDataLists = new ArrayList<ReturnDataList>();
		
		Orders orders = ordersRepository.findById(id)
				.orElseThrow(EntityNotFoundException::new);
		
		MemberDto memberDto = new MemberDto();
		
		Member member = orders.getMember();
		
		memberDto.setId(member.getId());
		memberDto.setAddress(member.getAddress());
		memberDto.setEmail(member.getEmail());
		memberDto.setName(member.getName());
		memberDto.setName(member.getName());
		memberDto.setPassword(member.getPassword());
		memberDto.setRole(member.getRole());
		
		OrdersDto ordersDto = new OrdersDto();
		ordersDto.setOrder_id(orders.getId());
		ordersDto.setOrder_status(orders.getOrder_status());
		ordersDto.setMember_id(orders.getMember().getId());
		
		List<OrderItem> orderItemsList = orders.getOrderItems();
		
		returnDataLists.add(memberDto);
		returnDataLists.add(ordersDto);

		OrderItemDto orderItemDto = null;
		for(OrderItem orderItem : orderItemsList) {
			orderItemDto = new OrderItemDto();
			orderItemDto.setOrder_item_id(orderItem.getId());
			orderItemDto.setCount(orderItem.getCount());
			orderItemDto.setOrder_price(orderItem.getOrder_price());
			orderItemDto.setItem_id(orderItem.getItem_id());
			orderItemDto.setOrder_id(orderItem.getOrders().getId());
			returnDataLists.add(orderItemDto);
			orderItemDto = null;
		}
		
		return returnDataLists;
	}
}
