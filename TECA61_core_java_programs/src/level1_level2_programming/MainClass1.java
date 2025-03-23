package level1_level2_programming;

class Movie {
	public static void ticket()
	{
		System.out.println("Watching Movie");
	}
}
class Park {
	public static void entertainment()
	{
		System.out.println("Playing with friens");
		Movie.ticket();
	}
}
public class MainClass1 {

	public static void main(String[] args) 
	{
		System.out.println("Main method");
		travel();
	}
	public static void travel()
	{
		System.out.println("Going to vijayawad");
		Park.entertainment();
	}

}

