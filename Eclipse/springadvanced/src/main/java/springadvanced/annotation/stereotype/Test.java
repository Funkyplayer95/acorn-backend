package springadvanced.annotation.stereotype;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx =
				new ClassPathXmlApplicationContext( "classpath:/springadvanced/annotation/stereotype/config.xml");
		
		Instructor instructor = (Instructor)ctx.getBean("instructor");
		
		System.out.println(instructor);
		
		ctx.close();
	}
}
