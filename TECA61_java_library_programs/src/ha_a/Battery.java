package ha_a;

public class Battery {
	String type;
	int capacity;
	int voltage;
	int chargingTime;

	public Battery(String type, int capacity, int voltage, int chargingTime) {
		this.type = type;
		this.capacity = capacity;
		this.voltage = voltage;
		this.chargingTime = chargingTime;
	}

	public void display() {
		System.out.println(type);
		System.out.println(capacity);
		System.out.println(voltage);
		System.out.println(chargingTime);
	}

}
