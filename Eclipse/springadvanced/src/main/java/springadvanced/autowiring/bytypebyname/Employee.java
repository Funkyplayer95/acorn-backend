package springadvanced.autowiring.bytypebyname;

public class Employee {

//	private Address address;
//
//	public Address getAddress() {
//		return address;
//	}
//
//	public void setAddress(Address address) {
//		this.address = address;
//	}
	
	private Address address1;

	public Address getAddress1() {
		return address1;
	}

	public void setAddress1(Address address1) {
		this.address1 = address1;
	}
	
//	@Override
//	public String toString() {
//		return getAddress().toString();
//	}
	public String toString() {
		return getAddress1().toString();
	}
}
