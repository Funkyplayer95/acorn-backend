package com.spring.boot.web.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.boot.web.login.entity.UserInfo;

public interface Userrepos extends JpaRepository<UserInfo, Integer>{

}
