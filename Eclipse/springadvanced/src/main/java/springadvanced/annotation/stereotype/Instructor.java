package springadvanced.annotation.stereotype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Instructor {
	
	
	@Value("15")
	private int id;
	@Value("ddpc")
	private String name;
	
	@Autowired //setter호출
	Address address;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return getId() + ":" + getName() + ":[" + getAddress() + "]";
	}
}
