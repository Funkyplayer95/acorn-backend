package springmvc_uitoctrl.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import springmvc_uitoctrl.dto.Order;

@Controller
public class OrderController2 {

	@RequestMapping("/orderPage3") //주소창에 입력될 값
	public String orderPage() {
	
		return "order1"; // 이동할 jsp 파일 이름
	}
	
	// @ModelAttribute
	// @RequestParam
	@RequestMapping("/showOrder3")
	public String showOrder(@ModelAttribute("order") Order order, ModelMap model) {
		
		// 데이터 지정: Order DTO 사용
		model.addAttribute("order", order);
		
		return "showOrder1";
	}
}
