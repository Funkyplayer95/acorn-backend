package com.acorn.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter //getter생성
@Setter //setter생성
@AllArgsConstructor //필드 인자있는 생성자
@NoArgsConstructor //필드 인자없는 생성자
@ToString //toString 클래스 생성

public class User {

	private String name;
	private int age;
	private String password;
}
