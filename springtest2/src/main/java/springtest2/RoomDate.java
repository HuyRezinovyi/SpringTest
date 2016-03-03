package springtest2;

import java.util.Date;

public class RoomDate {
	private Auditorium room;
	private Date dateTime;
	
	public Auditorium getAuditorium(){
		return this.room;
	}
	
	public Date getDate(){
		return this.dateTime;
	}
	
	public RoomDate(Auditorium room, Date date){
		this.room = room;
		this.dateTime = date;
	}
	
}
