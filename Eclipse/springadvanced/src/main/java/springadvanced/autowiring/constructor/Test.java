package springadvanced.autowiring.constructor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx =
				new ClassPathXmlApplicationContext( "classpath:/springadvanced/autowiring/constructor/awconfig.xml");
		
		Employee employee = (Employee)ctx.getBean("employee");
		
		System.out.println(employee);
		
		ctx.close();
	}
}
