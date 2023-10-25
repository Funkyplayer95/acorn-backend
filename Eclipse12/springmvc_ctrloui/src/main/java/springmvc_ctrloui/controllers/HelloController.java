package springmvc_ctrloui.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
}
