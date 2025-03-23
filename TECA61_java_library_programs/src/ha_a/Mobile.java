package ha_a;

public class Mobile {
	String brand;
	int cost;
	int ram;
	int rom;
	Battery b;
	public Mobile(String brand, int cost, int ram, int rom, Battery b) {
		this.brand = brand;
		this.cost = cost;
		this.ram = ram;
		this.rom = rom;
		this.b = b;
	}
	public void display()
	{
		System.out.println(brand);
		System.out.println(cost);
		System.out.println(ram);
		System.out.println(rom);
		System.out.println(b.type);
		System.out.println(b.capacity);
		System.out.println(b.chargingTime);
		System.out.println(b.voltage);
	}
}
