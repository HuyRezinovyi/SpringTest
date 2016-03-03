package springtest2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class User {
	
	private String firstName;
	private String lastName;
	private String id;
	private String email;
	
	private List<Ticket> tickets;
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getId() {
		return id;
	}

	public void setId() {
		Integer idD = (int) (Math.random()*1000);
		this.id = idD.toString();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Ticket> getTickets() {
		return tickets;
	}

	public void addTickets(List<Ticket> tickets) {
		this.tickets.addAll(tickets);
	}
	
	public void addTicket(Ticket ticket){
		List<Ticket> list = new ArrayList<Ticket>();
		list.add(ticket);
		addTickets(list);
	}
	
	public User(String firstName, String lastName, String email){
		setFirstName(firstName);
		setLastName(lastName);
		setEmail(email);
		setId();
	}
	
}