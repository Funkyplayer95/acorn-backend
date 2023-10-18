package springadvanced.annotation._interface;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx =
				new ClassPathXmlApplicationContext( "classpath:/springadvanced/annotation/_interface/config.xml");
		
		OrderService orderService = (OrderService)ctx.getBean("orderServiceImpl");
		orderService.placeOrder();
		
		ctx.close();
	}
}
