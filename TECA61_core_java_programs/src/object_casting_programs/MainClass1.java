package object_casting_programs;

public class MainClass1 {

	public static void main(String[] args) {
		Fruit f = (Fruit) new Mango();
		f.healthy();
		Mango m = (Mango)f;
		m.healthy();
		m.taste();
		Fruit g = (Fruit) new Apple();
		Apple a = (Apple) g;
		a.healthy();
		a.yummy();
	}

}
class Fruit {
	public void healthy()
	{
		System.out.println("Healthy");
	}
}
class Mango extends Fruit{
	public void taste()
	{
		System.out.println("Taste");
	}
}
class Apple extends Fruit{
	public void yummy()
	{
		System.out.println("yummy");
	}
}