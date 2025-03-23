package ha_a;

public class Customer {
	public static void main(String[] args) {
		Library l = new Library("Grandalayam", "HYD", "9:00AM - 5:00PM",
				new Book(89263, "Ramayam", 600, "Valmiki", 400));
		l.display();
	}
}
