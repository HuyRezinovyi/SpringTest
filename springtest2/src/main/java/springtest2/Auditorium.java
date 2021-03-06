package springtest2;

public class Auditorium {
	private String name;
	private int numOfSeats;
	private int numOfVipSeats;
	
	public Auditorium(String name, int numOfSeats, int numOfVipSeats) {
		super();
		this.name = name;
		this.numOfSeats = numOfSeats;
		this.numOfVipSeats = numOfVipSeats;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumOfSeats() {
		return numOfSeats;
	}
	public void setNumOfSeats(int numOfSeats) {
		this.numOfSeats = numOfSeats;
	}
	public int getNumOfVipSeats() {
		return numOfVipSeats;
	}
	public void setNumOfVipSeats(int numOfVipSeats) {
		this.numOfVipSeats = numOfVipSeats;
	}
}
