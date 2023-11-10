package com.spring.boot.web.jpa.test.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "product_new")
@Getter
@Setter
@ToString
public class Product {

	@Id
	private int id;
	private String name;
	private String description;
	private float price;

}