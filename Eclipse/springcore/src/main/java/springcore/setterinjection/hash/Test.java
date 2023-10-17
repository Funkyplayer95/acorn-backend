package springcore.setterinjection.hash;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext(
						"classpath:/springcore/setterinjection/hash/mapconfig.xml");
		Phone phone = (Phone)ctx.getBean("phone");
		System.out.println(phone.getSmartphone());
		ctx.close();
		
	}
}
