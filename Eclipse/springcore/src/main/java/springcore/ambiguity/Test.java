package springcore.ambiguity;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {	
	
	public static 
		ClassPathXmlApplicationContext ctx = null;
	
	public static void main(String[] args) {
		ctx = new ClassPathXmlApplicationContext(
			"classpath:/springcore/ambiguity/ambiciconfig.xml");
		
		Addition addition = (Addition)ctx.getBean("addition");
		
		ctx.close();
	}
}
