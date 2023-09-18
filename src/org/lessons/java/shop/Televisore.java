package org.lessons.java.shop;

public class Televisore extends Prodotto{
	
	private int inchTv;
	private boolean smartTv;
	
	Televisore(String name, String brand, float price, int inchTv, boolean smartTv) {
		
		super(name, brand, price);
		setInchTv(inchTv);
		setSmartTv(smartTv);
	}
	
	///INCH TV
	public int getInchTv() {
		
		return inchTv;
	}
	
	public void setInchTv(int inchTv) {
		
		this.inchTv = inchTv;
	}
	
	///SMART TV
	public boolean getSmartTv() {
		
		return smartTv;
	}
	
	public void setSmartTv(boolean smartTv) {
		
		this.smartTv = smartTv;
	}
	
	@Override
	public String toString() {
		
		return super.toString() +
				"Inch TV: " + getInchTv() + "″ | " +
				"Smart TV: " + (getSmartTv() ? "yes" : "no") + " | ";
	}
}
