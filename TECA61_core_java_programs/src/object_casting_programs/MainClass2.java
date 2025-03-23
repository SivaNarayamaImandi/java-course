package object_casting_programs;

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
public class MainClass2 {

	public static void main(String[] args) {
		WildAnimal wa1 = (WildAnimal)new Lion();
		wa1.hunt();
		wa1.roam();
		Animal a=(Animal)wa1;
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