package springtest2;

import java.lang.reflect.Method;
import java.util.Date;

public class App {
	public static void main(String[] args){
	//	RoomDate rd = new RoomDate(new Auditorium("asdas", 123, 0), new Date());
		Method[] methods = int.class.getMethods();
		System.out.println(int.class.getName());
		for(Method m:methods)
			System.out.println(m.getName());
	}
}
