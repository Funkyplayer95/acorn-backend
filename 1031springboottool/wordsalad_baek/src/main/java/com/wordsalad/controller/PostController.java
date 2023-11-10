package com.wordsalad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.wordsalad.dto.CmtDto;
import com.wordsalad.dto.PostDto;
import com.wordsalad.service.CmtService;
import com.wordsalad.service.PostService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class PostController {
	
	@Autowired
	private final PostService postService;
	@Autowired
	private final CmtService cmtService;

	@GetMapping("/Post")
	public String findById(@RequestParam("postnum") int postnumer ,ModelMap modelMap) {
		PostDto postData = postService.getpostInfo(postnumer);
		CmtDto cmtData = cmtService.getcmtInfo(postnumer);
		modelMap.addAttribute("postinfo", postData);		
		modelMap.addAttribute("cmtinfo", cmtData);		
		return "Post";
	}
}
