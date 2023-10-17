package springcore.university;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx =
				new ClassPathXmlApplicationContext("classpath:/springcore/university/universityconfig.xml");
		
		University university = (University)ctx.getBean("university");
	
		System.out.println(university);
		ctx.close();
	}
}
