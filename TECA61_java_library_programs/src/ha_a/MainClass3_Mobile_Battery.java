package ha_a;

public class MainClass3_Mobile_Battery {
	public static void main(String[] args) {
		Mobile m = new Mobile("Apple", 54000, 4, 128, new Battery("li-type", 4300, 4, 4));
		m.display();
	}
}
