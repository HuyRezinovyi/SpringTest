package springtest2;

import java.util.List;

public class AuditoriumService {
	List<Auditorium> auditoriums;
	
	public List<Auditorium> getAuditoriums(){
		return auditoriums;
	}
	
	public int getSeatsNumber(Auditorium auditorium){
		return auditorium.getNumOfSeats();
	}
	
	public int getVipSeats(Auditorium auditorium){
		return auditorium.getNumOfVipSeats();
	}
	
	public String getName(Auditorium auditorium){
		return auditorium.getName();
	}
	
}
