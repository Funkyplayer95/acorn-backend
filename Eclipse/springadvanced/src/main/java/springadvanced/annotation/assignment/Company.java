package springadvanced.annotation.assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Company {
	
	@Value("에이콘아카데미")
	private String name;
	
	@Autowired
	Location location;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	
	@Override
	public String toString() {
		return getName() + " [" + getLocation() +  "]";
	}
}
