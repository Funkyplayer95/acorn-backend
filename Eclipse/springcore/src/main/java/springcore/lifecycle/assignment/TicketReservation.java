package springcore.lifecycle.assignment;

public class TicketReservation {

	private int ticketNum;
	private int id;
	private String name;
	
	public int getTicketNum() {
		return ticketNum;
	}
	public void setTicketNum(int tiketNum) {
		this.ticketNum = tiketNum;
	}
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
	
	@Override
	public String toString() {
		return "티켓 No."+ getTicketNum() + " / 아이디: " + getId() + " / 예약자: " + getName() ;
	}
	
}
