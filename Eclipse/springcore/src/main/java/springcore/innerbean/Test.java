package springcore.innerbean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx =
				new ClassPathXmlApplicationContext( "classpath:/springcore/innerbean/innerbeanconfig.xml");
		
		Employee employee1 = (Employee)ctx.getBean("employee");
		
		Employee employee2 = (Employee)ctx.getBean("employee");
		
		System.out.println(employee1);
		System.out.println(employee2.hashCode());
		ctx.close();
	}
}
