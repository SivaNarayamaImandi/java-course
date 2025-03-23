package level1_level2_programming;

class PgHostel {
	public void pg()
	{
		System.out.println("Staying at Pg");
	}
}
class Hostel {
	public void hostel()
	{
		System.out.println("Staying at Hostel");
		PgHostel p = new PgHostel();
		p.pg();
	}
}
public class MainClass2 {

	public static void main(String[] args) 
	{
		System.out.println("Staying information");
		MainClass2 h = new MainClass2();
		h.house();
	}
	public void house()
	{
		System.out.println("Staying at House");
		Hostel h = new Hostel();
		h.hostel();
	}

}
