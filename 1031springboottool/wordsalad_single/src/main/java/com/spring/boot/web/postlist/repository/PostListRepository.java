package com.spring.boot.web.postlist.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.boot.web.mainpage.entity.Postinfo;

public interface PostListRepository extends JpaRepository<Postinfo, Integer>{
//	List<PostInfo> findById(int id);
}
