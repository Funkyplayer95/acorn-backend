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
public class MemberDto implements ReturnDataList {
	private int id;
	private String address;
	private String email;
	private String name;
	private String password;
	private String role;
	
}
