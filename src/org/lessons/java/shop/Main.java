package org.lessons.java.shop;

public class Main {

	public static void main(String[] args) {
		
		///GENERAL PRODUCT
		Prodotto test1 = new Prodotto("S23","Samsung",600.00f);
		System.out.println(test1);
		
		///SMARTPHONE
		Smartphone test2 = new Smartphone("P30", "Huawei", 349.00f, 256);
		System.out.println(test2);
		
		///TELEVISION
		Televisore test3 = new Televisore("The Frame", "Samsung", 1099.00f, 60, true);
		System.out.println(test3);
	}
}
