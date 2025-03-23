package assignment_object_casting_programs;

public class MainClass1 {
	public static void main(String[] args) {
		Animal a =(Animal)new Lion();
		a.roam();
		WildAnimal wa2 = (WildAnimal)a;
		wa2.roam();
		wa2.hunt();
		Lion l = (Lion)wa2;
		l.roam();
		l.hunt();
		l.rule();
	}
}
class Animal {
	public void roam()
	{
		System.out.println("roam");
	}
}
class WildAnimal extends Animal{
	public void hunt()
	{
		System.out.println("Hunt");
	}
}
class Lion extends WildAnimal{
	public void rule()
	{
		System.out.println("Rule");
	}
}