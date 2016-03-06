package springtest2;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DAOAuditoriumEvent {
	public static Map<RoomDate, Event> map = new LinkedHashMap<RoomDate, Event>();
	
	public void add(RoomDate roomDate, Event event){
		map.put(roomDate, event);
	}
	
	public void remove(RoomDate roomDate, Event event){
		map.remove(roomDate, event);
	}
	
	public Event findByRoomDate(RoomDate roomDate){
		return map.get(roomDate);
	}
	
	public List<RoomDate> findByEvent(Event event){
		List<RoomDate> lst = new ArrayList<RoomDate>(); 
		
		for (RoomDate rm: map.keySet()){
			if (map.get(rm).equals(event))
				lst.add(rm);
		}
		
		if (!lst.isEmpty())
			return lst;
		
		return null;
	}
	
	public List<Event> findEventByDate(Date date){
		List<Event> lst = new ArrayList<Event>();
		
		Set<RoomDate> set = map.keySet();
		for (RoomDate r: set){
			if (r.getDate().equals(date))
				lst.add(map.get(r));
		}
		if(!lst.isEmpty())
			return lst;
		
		return null;
	}
	
}
