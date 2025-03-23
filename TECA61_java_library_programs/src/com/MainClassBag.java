package com;

public class MainClassBag {
	public static void main(String[] args) {
		Bag b1 = new Bag("vip", "blue", 2000, 20, 4, "collegebag");
		Bag b2 = new Bag("skybag", "pink", 3000, 10, 2, "trolly");
		Bag b3 = new Bag("american toursiter", "orange", 5000, 30, 3, "trollybags");
		b1.display();
		System.out.println("---------------------------------");
		b3.display();
		System.out.println("----------------------------------");
		b2.setCost(7000);
		b2.display();
	}
}
