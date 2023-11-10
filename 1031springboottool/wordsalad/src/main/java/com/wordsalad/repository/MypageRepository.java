package com.wordsalad.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wordsalad.entity.User;

public interface MypageRepository extends JpaRepository<User, String> {
	 
//	Optional<User> findByNickName(String nickname);
}
