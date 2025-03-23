package level1_level2_programming;

class Cricket {
	public static void batting() {
		System.out.println("Batting");
		bowling();
	}
	public static void bowling() {
		System.out.println("Bowling");
	}
}

class Vollyball {
	public void firstShot() {
		System.out.println("First Shot");
		secondShot();
	}
	public void secondShot() {
		System.out.println("Second Shot");
	}
}

class KhoKho {
	public void players() {
		System.out.println("Normal Players");
		keyPlayer();
	}
	public static void keyPlayer() {
		System.out.println("Key Player");
	}
}

public class MainClass3 {

	public static void main(String[] args) {
		System.out.println("Sports information");
		MainClass3 s = new MainClass3();
		s.sports();
	}
	public void sports() {
		System.out.println("Sports List");
		Cricket.batting();
		Vollyball v = new Vollyball();
		v.firstShot();
		KhoKho k = new KhoKho();
		k.players();
	}

}
