package assignment_object_casting_programs;

public class MainClass2 {
	public static void main(String[] args) {
		Human wa1 = (Human)new RamCharan();
		wa1.hunt();
		wa1.roam();
		LivingThing a=(LivingThing)wa1;
		a.roam();
		RamCharan l = (RamCharan)a;
		l.roam();
		l.hunt();
		l.rule();
	}
}
class LivingThing {
	public void roam()
	{
		System.out.println("Can live on earth");
	}
}
class Human extends LivingThing{
	public void hunt()
	{
		System.out.println("Can Travel");
	}
}
class RamCharan extends Human{
	public void rule()
	{
		System.out.println("Actor");
	}
}