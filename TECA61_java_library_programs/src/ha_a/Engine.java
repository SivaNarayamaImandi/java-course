package ha_a;

public class Engine {
	int capacity;
	int horsePower;
	int torque;
	int millage;

	public Engine(int capacity, int horsePower, int torque, int millage) {
		this.capacity = capacity;
		this.horsePower = horsePower;
		this.torque = torque;
		this.millage = millage;
	}

	public void display() {
		System.out.println(capacity);
		System.out.println(horsePower);
		System.out.println(torque);
		System.out.println(millage);
	}
}
