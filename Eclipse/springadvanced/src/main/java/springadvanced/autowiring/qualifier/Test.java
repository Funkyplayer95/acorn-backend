package springadvanced.autowiring.qualifier;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx =
				new ClassPathXmlApplicationContext( "classpath:/springadvanced/autowiring/qualifier/awconfig.xml");
		
		Employee employee = (Employee)ctx.getBean("employee");
		
		System.out.println(employee);
		
		ctx.close();
	}
}
