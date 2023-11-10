package com.wordsalad.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name="COMMENTINFO")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Cmtinfo {
	
	@ManyToOne
    @JoinColumn(name = "postnumber")
	private Postinfo postinfo;
	@Id
	private int COMMENT_SEQ;
	private String COMMENTCONTENTS;
	private String COMMENTWRITER;
	private String COMMENTDATE;
	private int COMMENTLIKE;
	private int COMMENTHATE;
	
}
