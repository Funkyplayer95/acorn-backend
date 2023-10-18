package springadvanced.autowiring.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
	@Autowired(required = false) //autowired 사용 안한다는 것
	@Qualifier("address123") //config에서 name이 무엇인가에 따라 사용가능하게끔. 
	private Address address;
	
	public Employee(Address address) {
		this.address=address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	@Override
	public String toString() {
		return getAddress().toString();
	}

}
