package springmvc_uitoctrl.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import springmvc_uitoctrl.dto.User;

@Controller
public class UserController {

	@RequestMapping("/userreg")
	public ModelAndView register(@ModelAttribute("user") User user) {
		ModelAndView modelAndView = 
				new ModelAndView();
		modelAndView.setViewName("userreg");
		System.out.println(user);		
		return modelAndView;
	}
}

//1. Controller: modelAndView.addObject("user", user);
//1. showUser.jsp
//${user.id}
//${user.name}
//${user.sal}