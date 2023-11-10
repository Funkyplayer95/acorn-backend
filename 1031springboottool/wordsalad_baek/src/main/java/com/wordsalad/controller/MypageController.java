package com.wordsalad.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.wordsalad.dto.UserDto;
import com.wordsalad.service.MypageService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class MypageController {
	
	@Autowired
	private final MypageService mypageService;

	@GetMapping("/") // URL주소
	public String main() {
		return "main"; // JSP파일
	}

	@GetMapping("/Mypage")
	public String findById(@RequestParam("id") String id ,ModelMap modelMap) {
		UserDto userInfoData = mypageService.getuserInfo(id);
		
		modelMap.addAttribute("userinfo", userInfoData);
		
		return "Mypage";
	}
	
	public String save() {
		
		return "";
	}
}
