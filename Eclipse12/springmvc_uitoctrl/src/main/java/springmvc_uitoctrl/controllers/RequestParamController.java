package springmvc_uitoctrl.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RequestParamController {
	
	@RequestMapping("/showPararm")
	public ModelAndView showPararm(
			@RequestParam("id") String id,
			@RequestParam("name") String name,
			@RequestParam("salary") double sal) {
		ModelAndView modelAndView =
				new ModelAndView();
		
		System.out.println(id + ":" + name + ":" + sal);

		modelAndView.setViewName("showUser");
		
		return modelAndView;
		
	}
	
//	modelAndView.addObject("id", id);
//	modelAndView.addObject("name", name);
//	modelAndView.addObject("sal", sal);
//	${id}
//	${name}
//	${sal}
	
	
}
