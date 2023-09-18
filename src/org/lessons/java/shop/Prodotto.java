package org.lessons.java.shop;

public class Prodotto {
	
	private String code;
	public String name;
	public String brand;
	public int price;
	public int vat;
	
	public Prodotto(String code, String name, String brand, int price, int vat) {
		
		setCode(code);
		setName(name);
		setBrand(brand);
		setPrice(price);
		setVat(vat);
		
	}
	
	///CODE
	public String getCode() {
		
		return code;
	}
	
	public void setCode(String code) {
		
		this.code = code;
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
	public int getPrice() {
		
		return price;
	}
	
	public void setPrice(int price) {
		
		this.price = price;
	}
	
	///VAT
	public int getVat() {
		
		return vat;
	}
	
	public void setVat(int vat) {
		
		this.vat = vat;
	}
	
	
	
}
