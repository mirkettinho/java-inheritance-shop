package org.lessons.java.shop;

public class Cuffie extends Prodotto{
	
	private String color;
	private boolean wireless;
	
	Cuffie(String name, String brand, float price, String color, boolean wireless) {
		
		super(name, brand, price);
		setColor(color);
		setWireless(wireless);
	}
	
	///COLOR
	public String getColor() {
		
		return color;
	}
	
	public void setColor(String color) {
		
		this.color = color;
	}
	
	///WIRELESS
	public boolean getWireless() {
		
		return wireless;
	}
	
	public void setWireless(boolean wireless) {
		
		this.wireless = wireless;
	}
	
	
	@Override
	public String toString() {
		
		return super.toString() +
				"Color : " + getColor() + " | " +
				"Wireless : " + (getWireless() ? "yes" : "no") + " | ";
	}
}
