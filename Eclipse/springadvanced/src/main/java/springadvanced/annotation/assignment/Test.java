package springadvanced.annotation.assignment;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx =
				new ClassPathXmlApplicationContext( "classpath:/springadvanced/annotation/assignment/config.xml");
		
		Person person = (Person)ctx.getBean("person");
		
		System.out.println(person);
		
		ctx.close();
	}
}
