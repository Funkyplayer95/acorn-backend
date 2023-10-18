package springadvanced.autowiring.assignment;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx =
				new ClassPathXmlApplicationContext( "classpath:/springadvanced/autowiring/assignment/awconfig.xml");
		
		Customer customer = (Customer)ctx.getBean("customer");
		
		System.out.println(customer);
		
		ctx.close();
	}
}
