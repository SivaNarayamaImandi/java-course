package com;

public class Bag {
	// WAPFBR
	// CREATE A CLASS CALLED BAG
	// DECLARE BAG ATTRIBUTES ARE
	// BRAND,COLOR,COST,CAPACITY,NO OF COMPARTMENTS,TYPE
	// CREATE A METHOD TO DISPLAY BAG DETAILS
	// CREATE 4 BAG OBJECTS
	// WAPTD 1ST AND 3RD BAG DETAILS
	// WAPT UPDATE 2ND BAG COST
	// NOTE : WA CODE FOR ABOVE REQUIREMENT BY USING JAVA BEAN OVERRIDE TOSTRING
	// OVERRIDE EQUALS
	private String brand;
	private String color;
	private int cost;
	private int capacity;
	private int noofCompartments;
	private String bagType;

	public Bag() {

	}

	public Bag(String brand, String color, int cost, int capacity, int noofCompartments, String bagType) {

		this.brand = brand;
		this.color = color;
		this.cost = cost;
		this.capacity = capacity;
		this.noofCompartments = noofCompartments;
		this.bagType = bagType;
	}

	public String getBrand() {
		return brand;
	}

	public String getColor() {
		return color;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getCost() {
		return cost;
	}

	public int getCapacity() {
		return capacity;
	}

	public int getnoofCompartments() {
		return noofCompartments;
	}

	public String getbagType() {
		return bagType;
	}

	public void display() {
		System.out.println("bag details are: ");
		System.out.println(getBrand());
		System.out.println(getColor());
		System.out.println(getCost());
		System.out.println(getCapacity());
		System.out.println(getnoofCompartments());
		System.out.println(getbagType());
	}
}
