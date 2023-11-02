package springmvc_uitoctrl.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import springmvc_uitoctrl.dto.Order;

@Controller
public class OrderController {

	@RequestMapping("/orderPage1")
	public ModelAndView orderPage() {
		ModelAndView modelAndView =
				new ModelAndView();
		
		//페이지 지정: /WEB-INF/views/order.jsp
		modelAndView.setViewName("order");
		
		return modelAndView;
	}
	
	@RequestMapping("/orderPage2")
	public ModelAndView orderPage2() {
		ModelAndView modelAndView =
				new ModelAndView();
		
		//페이지 지정
		modelAndView.setViewName("orderOther");
		
		return modelAndView;
	}
	
	// @ModelAttribute
	// @RequestParam
	@RequestMapping("/showOrder")
	public ModelAndView showOrder(@ModelAttribute("order") Order order) {
		ModelAndView modelAndView =
				new ModelAndView();
		
		// 데이터 지정: Order DTO 사용
		order.setOrdergoods("상품123");
		order.setQuantity(123);
		modelAndView.addObject("order", order);
		// 페이지 지정
		modelAndView.setViewName("showOrder");
		
		return modelAndView;
	}
	
	// @ModelAttribute
	// @RequestParam
	@RequestMapping("/showOrderOther")
	public ModelAndView showOrder(
			@RequestParam(value="ordergoods") String goods,
			@RequestParam(value="quantity", required = false) int qty) {
		ModelAndView modelAndView =
				new ModelAndView();
		
		// 데이터 지정: Order DTO 사용
		modelAndView.addObject("goods", goods);
		modelAndView.addObject("qty", qty);
		// 페이지 지정
		modelAndView.setViewName("showOrderOther");
		
		return modelAndView;
	}
}
