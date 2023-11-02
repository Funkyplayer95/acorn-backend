package springmvc_ctrltoui.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import springmvc_ctrltoui.dtos.UserInfoDto;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public ModelAndView hello() {
		ModelAndView modelAndView 
			= new ModelAndView();
		// /WEB-INF/displays/hello.jsp
		modelAndView.setViewName("hello");  
		
		return modelAndView;
	}
	
	@RequestMapping("/ui01")
	public ModelAndView toui01() {
		ModelAndView modelAndView 
			= new ModelAndView();
		// /WEB-INF/displays/hello.jsp
		modelAndView.setViewName("ui/uitest01");  
		modelAndView.addObject("id", "woseven");
		modelAndView.addObject("passwd", "woseven");
		modelAndView.addObject("salary", 1000);
		
		return modelAndView;
	}
	
	@RequestMapping("/ui02")
	public ModelAndView toui02() {
		ModelAndView modelAndView 
			= new ModelAndView();
		// /WEB-INF/displays/hello.jsp
		modelAndView.setViewName("ui/uitest02");  
		modelAndView.addObject("id", "kht");
		modelAndView.addObject("passwd", "kht");
		modelAndView.addObject("salary", 2000);
		
		return modelAndView;
	}
	
	@RequestMapping("/uiobj01")
	public ModelAndView uiobj01() {
		ModelAndView modelAndView 
			= new ModelAndView();
		// /WEB-INF/displays/hello.jsp
		modelAndView.setViewName("ui/uiobjtest01");
		
		modelAndView.addObject("userinfo", 
				new UserInfoDto("123", "321", "admin"));
		
		return modelAndView;
	}
	
	@RequestMapping("/uiobjlist01")
	public ModelAndView uiobjlist01() {
		ModelAndView modelAndView 
			= new ModelAndView();
		// /WEB-INF/displays/hello.jsp
		modelAndView.setViewName("ui/uiobjlisttest01");
			
		List<UserInfoDto> userInfoList = 
				new ArrayList<UserInfoDto>();
		
		userInfoList.add(new UserInfoDto("woseven1", "12345", "admin"));
		userInfoList.add(new UserInfoDto("woseven2", "54321", "user"));
		userInfoList.add(new UserInfoDto("woseven2", "67890", "user"));
		
		modelAndView.addObject("userinfolist", userInfoList);
		
		return modelAndView;
	}
}
