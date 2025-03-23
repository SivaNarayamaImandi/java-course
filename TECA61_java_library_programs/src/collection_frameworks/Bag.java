package collection_frameworks;

public class Bag {
	private String brand;
	private String color;
	private int cost;
	private int capacity;

	public Bag(String brand, String color, int cost, int capacity) {
		this.brand = brand;
		this.color = color;
		this.cost = cost;
		this.capacity = capacity;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return brand + color + cost + capacity;
	}

	public void display() {
		System.out.println(getBrand());
		System.out.println(getColor());
		System.out.println(getCost());
		System.out.println(getCapacity());
	}
}
