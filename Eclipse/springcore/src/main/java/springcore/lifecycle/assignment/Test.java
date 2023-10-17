package springcore.lifecycle.assignment;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext(
						"classpath:/springcore/lifecycle/assignment/Ticketconfig.xml");
		TicketReservation tr = (TicketReservation)ctx.getBean("ticket");
		System.out.println(tr);
		ctx.close();
		
	}
}
