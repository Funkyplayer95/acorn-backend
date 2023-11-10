package com.spring.boot.web.jpa.join.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.boot.web.jpa.join.entity.Member;

public interface MemberRepository 
		extends JpaRepository<Member, Integer>{

}
