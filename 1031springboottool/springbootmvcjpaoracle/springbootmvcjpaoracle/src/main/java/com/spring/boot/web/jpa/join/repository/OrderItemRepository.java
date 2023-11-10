package com.spring.boot.web.jpa.join.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.boot.web.jpa.join.entity.OrderItem;

public interface OrderItemRepository 
		extends JpaRepository<OrderItem, Integer>{

}
