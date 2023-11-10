package com.wordsalad.dto;

import com.wordsalad.entity.User;

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
public class UserDto  {
	
	private String id;
	
	private String pw;
	
	private String tel;
	
	private String nickname;
	
	private int postcount;
	private int commentcount;
	private String state;
	private String registdate;
	

	//repository 를 통해 조회한 entity 를 dto 로 변환 용도 
    public UserDto(User user) {
        this.id = user.getId();
        this.pw = user.getPw();
        this.tel = user.getTel();
        this.nickname = user.getNickname();
        this.state = user.getState();
        this.registdate = user.getRegistdate();
    }
}
