package com.spring.boot.web.mainpage.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name= "POSTINFO")
@Getter
@Setter
@ToString
public class Postinfo {
	@Id
	private int postnumber;
	
	private String posttitle;
	private String postcontents;

	private String postwriter;
	private String postdate;
	private int postlike;
	private int posthate;
	private String category;
	
}
