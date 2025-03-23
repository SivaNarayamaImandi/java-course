package level2_assignment_programs;

public class MainClass1 {
	public static void main(String[] args) 
	{
		Player.play();
		Volleyball.move();
	}

}
class Player {
	public static void play()
	{
		System.out.println("Play");
	}
}
class Volleyball {
	public static void move()
	{
		System.out.println("Move");
	}
}