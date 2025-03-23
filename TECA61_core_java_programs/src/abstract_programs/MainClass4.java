package abstract_programs;

abstract class Z
{
	abstract public void play();
}
class X extends Z
{
	public void play()
	{
		System.out.println("playing......");
	}
}
public class MainClass4 {

	public static void main(String[] args) {
		Z b = (Z)new X();
		b.play();
	}

}
