package org.lessons.java.shop;

public class Smartphone extends Prodotto {

	private String imei;
	private int size;
	
	Smartphone(String name, String brand, float price, int size){
		
		super(name, brand, price);
		setImei();
		setSize(size);
	}
	
	///IMEI
	public String getImei() {
		
		return imei;
	}
	
	public void setImei() {
		
		this.imei = "354721987002725";
	}
	
	///SIZE
	public int getSize() {
		
		return size;
	}
	
	public void setSize(int size) {
		
		this.size = size;
	}
	
	@Override
	public String toString() {
		
		return super.toString() +
				"IMEI code: " + getImei() + " | " +
				"Memory size: " + getSize() + " GB" + " | ";
	}
}
