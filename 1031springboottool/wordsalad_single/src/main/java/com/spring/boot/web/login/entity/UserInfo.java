package com.spring.boot.web.login.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="USERINFO")
@Getter
@Setter
@ToString
public class UserInfo {
	@Id
	@Column(name="ID")
	private String id;
	
	@Column(name="PW")
	private String pw;
	
	@Column(name="NICKNAME")
	private String nickName;
	
	@Column(name="POSTCOUNT")
	private int postCount;
	
	@Column(name="COMMENTCOUNT")
	private int cmtCount;
	
	@Column(name="STATE")
	private String state;
	
	@Column(name="REGISTDATE")
	private String registDate;
}
