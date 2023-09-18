package org.lessons.java.shop;

public class Prodotto {
	
	private String code;
	private String name;
	private String brand;
	private float price;
	private final static int VAT = 20; /// English VAT
	
	public Prodotto(String name, String brand, float price) {
		
		setCode();
		setName(name);
		setBrand(brand);
		setPrice(price);
		
	}
	
	///CODE
	public String getCode() {
		
		return code;
	}
	
	public void setCode() {
		
		this.code = "F2A345GH1500XRT2 ";
	}
	
	///NAME
	public String getName() {
		
		return name;
	}
	
	public void setName(String name) {
		
		this.name = name;
	}
	
	///BRAND
	public String getBrand() {
		
		return brand;
	}
	
	public void setBrand(String brand) {
		
		this.brand = brand;
	}
	
	///PRICE
	public double getPrice() {
		
		return price;
	}
	
	public void setPrice(float price) {
		
		this.price = price;
	}
	
	///VAT
	public int getVat() {
		
		return VAT;
	}
	
	@Override
	public String toString() {
		
		return "Product code: " + getCode() + "| " +
				"Name : " + getName() + " | " +
				"Brand : " + getBrand() + " | " +
				"Price : " + getPrice() + " | " +
				"VAT : " + getVat() + "%" + " | "; 
	}
	
	
	
	
}
