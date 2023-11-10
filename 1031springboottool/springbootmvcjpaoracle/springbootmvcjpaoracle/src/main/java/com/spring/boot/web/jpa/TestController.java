package com.spring.boot.web.jpa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	@RequestMapping(value="/test", method = RequestMethod.GET)
	public ModelAndView getScoreInfo(
			@RequestParam String score1, 
			@RequestParam String score2) {
		int sum = Integer.valueOf(score1) + Integer.valueOf(score2);
		
		ModelAndView mv = new ModelAndView();
		List<String> items = new ArrayList<String>();
		items.add("김형태1");
		items.add("김형태2");
		items.add("김형태3");
		
		mv.addObject("list", items);
		mv.addObject("sum", sum);
		mv.setViewName("list");
		
		return mv;
	}
}
