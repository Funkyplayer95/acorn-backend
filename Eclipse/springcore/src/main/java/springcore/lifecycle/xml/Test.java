package springcore.lifecycle.xml;

//import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	//private static AbstractApplicationContext context;
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext(
						"classpath:/springcore/lifecycle/xml/LifeCycleconfig.xml");
		Patient patient = (Patient)ctx.getBean("patient");
		System.out.println(patient);
		//context.registerShutdownHook();
		ctx.close();
		
	}
}
