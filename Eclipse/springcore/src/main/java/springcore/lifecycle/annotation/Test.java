package springcore.lifecycle.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext(
						"classpath:/springcore/lifecycle/annotation/LifeCycleconfig.xml");
		Patient patient = (Patient)ctx.getBean("patient");
		System.out.println(patient);
		ctx.close();
		
	}
}
