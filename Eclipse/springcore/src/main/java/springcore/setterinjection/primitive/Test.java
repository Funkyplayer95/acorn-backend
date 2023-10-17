package springcore.setterinjection.primitive;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext(
						"classpath:/com/acorn/spring/springcore/config.xml");
		Employee emp = (Employee)ctx.getBean("emp");
		System.out.println(emp);
		
	}
}
