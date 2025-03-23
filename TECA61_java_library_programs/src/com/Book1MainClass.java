package com;

public class Book1MainClass {
	public static void main(String[] args) {
		Book1 b=new Book1(1234, "RAMAYANAM", "VALMIKI", 650, 600, "80's");
		Book1 b1=new Book1(45678, "MAHABHARATHAM", "KRISHNA", 1650, 2600, "80's");
		Book1 b2=new Book1(9785875, "LORD SHIVA", "BHRAMHA", 750, 500, "80's");
		b1.display();
		System.out.println();
		b.setBookCost(800);
		b.display();
		System.out.println();
		b2.setBookCost(1000);
		b2.display();
	}
}

