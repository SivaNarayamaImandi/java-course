package over_raiding_programs;

public class MainClass1 {

	public static void main(String[] args) {
		Tiger t = new Tiger();
		t.roam();
		t.hunt();
	}

}
abstract class LivingObject{
	public void roam()
	{
		System.out.println("roam");
	}
}
abstract class Animal extends LivingObject{
	public void hunt()
	{
		System.out.println("roam");
	}
}
class Tiger extends Animal{
	public void roam()
	{
		System.out.println("Travel");
	}
	public void hunt()
	{
		System.out.println("I'm not hunting");
	}
}