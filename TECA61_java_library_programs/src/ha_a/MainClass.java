package ha_a;

public class MainClass {
	public static void main(String[] args) {
		University u = new University(6012, "JNTUH", "HYD",
				new Department(201, "Mech", "SHIV", new Student("SIVA", 24, 78, 'M', 2)));
		u.universityDetails();
	}
}
