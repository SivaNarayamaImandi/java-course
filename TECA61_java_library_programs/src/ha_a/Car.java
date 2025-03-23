package ha_a;

public class Car {
	String name;
	int cost;
	String color;
	Engine e;

	public Car(String name, int cost, String color, Engine e) {
		this.name = name;
		this.cost = cost;
		this.color = color;
		this.e = e;
	}

	public void display() {
		System.out.println(name);
		System.out.println(cost);
		System.out.println(color);
		System.out.println(e.capacity);
		System.out.println(e.horsePower);
		System.out.println(e.torque);
		System.out.println(e.millage);
	}

}
