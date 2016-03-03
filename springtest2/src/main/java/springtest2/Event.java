package springtest2;

import java.util.Date;

public class Event {
	public enum rating{HIGH, MEDIUM, LOW};
	
	String name;
	double basePrice;
	rating rate;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBasePrice() {
		return basePrice;
	}
	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}
	public rating getRate() {
		return rate;
	}
	public void setRate(rating rate) {
		this.rate = rate;
	}
	
	public Event (String name, double basePrice, rating rate){
		setName(name);
		setBasePrice(basePrice);
		setRate(rate);
	}

}
