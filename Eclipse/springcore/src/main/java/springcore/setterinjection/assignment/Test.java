package springcore.setterinjection.assignment;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext(
						"classpath:/springcore/setterinjection/assignment/assignmentconfig.xml");
		ShoppingCart cart = (ShoppingCart)ctx.getBean("shoppingcart");
		System.out.println(cart.getItem());
		ctx.close();
		
	}
}
