package ha_a;

public class MainClass1_Car_Engine {
	public static void main(String[] args) {
		Car c = new Car("Audi", 500000, "Red", new Engine(250, 5, 4, 17));
		c.display();
	}
}
