package springadvanced.autowiring.assignment;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer {
	
	
	private String name;
	@Autowired
	private Reservation reservation;
	
	public Customer(Reservation reservation) {
		this.reservation=reservation;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Reservation getReservation() {
		return reservation;
	}


	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}


	@Override
	public String toString() {
		return "예약자 성함 : " + getName() + " / 예약내용 : " + getReservation();
	}

}
