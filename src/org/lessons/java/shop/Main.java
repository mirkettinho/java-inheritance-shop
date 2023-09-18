package org.lessons.java.shop;

public class Main {

	public static void main(String[] args) {
		
		///GENERAL PRODUCT
		Prodotto test1 = new Prodotto("S23","Samsung",600.00f);
		System.out.println(test1);
		
		///SMARTPHONE
		Smartphone test2 = new Smartphone("P30", "Huawei", 349.00f, 256);
		System.out.println(test2);
		
	}
}
