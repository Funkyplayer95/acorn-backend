package com.spring.boot.web.jpa.join.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.boot.web.jpa.join.entity.Orders;

public interface OrdersRepository 
		extends JpaRepository<Orders, Integer>{
}
