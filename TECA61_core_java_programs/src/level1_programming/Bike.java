package level1_programming;

public class Bike {

	public static void name()
	{
		System.out.println("Bike name KTM");
		Bike r = new Bike();
		r.price();
	}
	public void price()
	{
		System.out.println("Bike price 2,00,000/-");
	}
	public static void main(String[] args) 
	{
		System.out.println("Bike information");
		name();
	}

}
