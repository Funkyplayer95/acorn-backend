package com.spring.boot.data.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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
@Entity
@Table(name = "product")
public class Product {
	
	@Id
	private int id;
	private String name;
	@Column(name = "descr")
	private String description;
	private int price;
}

// 이 공간에서는 getter & setter, 생성자, 인자없는 생성자, toString, 엔티티클래스 지정, 테이블 지정
// @ID 는 PK지정 / @colum 은 필드값과 해당 테이블값을 같게 만들기 위해.
// @Data 는 @Getter, @Setter, @ToString, @EqualsAndHashCode, @RequiredArgsConstructor 를 합친거