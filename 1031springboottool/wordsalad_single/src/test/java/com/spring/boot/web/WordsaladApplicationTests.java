package com.spring.boot.web;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.spring.boot.web.mainpage.entity.Postinfo;
import com.spring.boot.web.postlist.repository.PostListRepository;


@SpringBootTest
class WordsaladApplicationTests {

//	@Test
//	void contextLoads() {
//	}
	
	@Autowired
	ApplicationContext ctx;
	
	@Test
	void savePost() {
		System.out.println(ctx + "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
//		PostListRepository repository = ctx.getBean(PostListRepository.class);
//		Postinfo postinfo = new Postinfo();
//		postinfo.setPostnumber(2);
//		postinfo.setPosttitle("insert test");
//		postinfo.setPostcontents("test를 test");
//		postinfo.setPostwriter("ekek");
//		postinfo.setCategory("nomal");
//		
//		repository.save(postinfo);
	}


//	@Test
//	void saveUser() {
//		System.out.println(ctx + "@@@@@@@@@@@@@@@@@@@@@");
//	}
}
