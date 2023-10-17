package springcore.setterinjection.hash;

import java.util.Map;

public class Phone {
	private Map<String, String> smartphone; // 제조사 , 제품

	public Map<String, String> getSmartphone() {
		return smartphone;
	}

	public void setSmartphone(Map<String, String> smartphone) {
		this.smartphone = smartphone;
	}

	
}

