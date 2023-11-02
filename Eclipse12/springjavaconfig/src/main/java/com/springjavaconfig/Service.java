package com.springjavaconfig;

import org.springframework.beans.factory.annotation.Autowired;

public class Service {

	@Autowired
	private Dao dao;
	
	public void save() {
		dao.creat();
	}
	public void hello() {
		System.out.println("객체 생성");
	}
	public void goodbye() {
		System.out.println("객체 소멸");
	}
}
