package com.wordsalad.service;


import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.wordsalad.dto.UserDto;
import com.wordsalad.entity.User;
import com.wordsalad.repository.MypageRepository;

import lombok.RequiredArgsConstructor;

@Service
@Transactional // 데이터를 불러와서 db에 넣고 실행이 끝나면 모든 작업들을 원상태로 되돌릴 수 있다. 안쓰는곳엔 (readOnly=true)
@RequiredArgsConstructor
public class MypageService {

	private final MypageRepository mypageRepository;

	public UserDto getuserInfo(String id) {

		User user = mypageRepository.findById(id).orElseThrow(EntityNotFoundException::new); // 언제나 ID값을 같이 넘겨야 null이 뜨지않음.
		UserDto userDto = new UserDto();

		userDto.setId(user.getId());
		userDto.setPw(user.getPw());
		userDto.setNickname(user.getNickname());
		userDto.setTel(user.getTel());
		userDto.setCommentcount(user.getCommentcount());
		userDto.setPostcount(user.getPostcount());
		userDto.setState(user.getState());
		userDto.setRegistdate(user.getRegistdate());

		return userDto;
	}

	public void updatePassword(String id, String newPw) {
		
		User user = mypageRepository.findById(id).orElse(null);
		
		if (user != null) {
			user.setPw(newPw);
			user.setCommentcount(user.getCommentcount());
			user.setNickname(user.getNickname());
			user.setPostcount(user.getPostcount());
			user.setRegistdate(user.getRegistdate().substring(0,10));
			user.setTel(user.getTel());
			user.setState(user.getState());
		
			mypageRepository.save(user);
		}
	}
	public void updateNickName(String id, String newNickname) {
		
		User user = mypageRepository.findById(id).orElse(null);
		
		if (user != null) {
			user.setPw(user.getPw());
			user.setCommentcount(user.getCommentcount());
			user.setNickname(newNickname);
			user.setPostcount(user.getPostcount());
			user.setRegistdate(user.getRegistdate().substring(0,10));
			user.setTel(user.getTel());
			user.setState(user.getState());
			
			mypageRepository.save(user);
		}
	}
	public void updateTel(String id, String newTel) {
		
		User user = mypageRepository.findById(id).orElse(null);
		
		if (user != null) {
			user.setPw(user.getPw());
			user.setCommentcount(user.getCommentcount());
			user.setNickname(user.getNickname());
			user.setPostcount(user.getPostcount());
			user.setRegistdate(user.getRegistdate().substring(0,10));
			user.setTel(newTel);
			user.setState(user.getState());
			
			mypageRepository.save(user);
		}
	}

	public void checkPassword(String id, String Pw) {
		User user = mypageRepository.findById(id).orElse(null);
		if (user != null) {
			if (user.getPw() == Pw) {

			} else {
				System.out.println("실패");
			}
		}
	}

}
