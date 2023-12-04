package springmybatis.dto;

public class UpdateConditions {
	int id;
	String address;

	public UpdateConditions() {}
	
	public UpdateConditions(int id, 
			String address) {
		this.id = id;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}