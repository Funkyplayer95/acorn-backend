package com.wordsalad.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="POSTINFO")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Postinfo {
	
	@Id
	private int POSTNUMBER;
	private String POSTTITLE;
	private String POSTCONTENTS;
	private String POSTWRITER;
	private String POSTDATE;
	private int POSTLIKE;
	private int POSTHATE;
	
//	@OneToMany(mappedBy = "postinfo", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
//	private List<CommentInfo> commentInfo = new ArrayList<CommentInfo>();

}

// findbyid(string id) return User타입
// user.setpw(컨트롤러에서 받아오는 값)
// user.settel(컨트롤러에서 받아오는 값)
// user.setnickname(컨트롤러에서 받아오는 값)
// user.setstate(컨트롤러에서 받아오는 값)

// mypagerepository.save(user)
