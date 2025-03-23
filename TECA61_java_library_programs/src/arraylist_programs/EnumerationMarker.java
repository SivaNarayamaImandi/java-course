package arraylist_programs;

public class EnumerationMarker {
	public String brand;
	public String color;
	public int cost;

	public EnumerationMarker() {
	}

	public EnumerationMarker(String brand, String color, int cost) {
		this.brand = brand;
		this.color = color;
		this.cost = cost;
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

	@Override
	public String toString() {
		return "Marker brand : " + brand + "Marker color : " + color + "Marker cost : " + cost;
	}

	public void display() {
		System.out.println("Marker brand : " + getBrand());
		System.out.println("Marker color : " + getColor());
		System.out.println("Marker cost : " + getCost());
	}

}
