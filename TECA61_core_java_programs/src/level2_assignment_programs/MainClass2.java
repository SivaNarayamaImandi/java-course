package level2_assignment_programs;

public class MainClass2 {

	public static void main(String[] args) {
		Mobile m = new Mobile();
		m.storePower();
		Charger c = new Charger();
		c.providePower();
	}

}
class Mobile {
	public void storePower()
	{
		System.out.println("storePower");
	}
}
class Charger {
	public void providePower()
	{
		System.out.println("providePower");
	}
}