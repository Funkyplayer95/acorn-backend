package springadvanced.annotation._interface;

import org.springframework.stereotype.Component;

@Component
public class OrderDao2Impl implements OrderDao {

	@Override
	public void createOrder() {
		System.out.println("inside order DAO createOrder2");

	}

}
