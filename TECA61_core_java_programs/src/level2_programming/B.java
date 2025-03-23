package level2_programming;

public class B {

	public static void main(String[] args) 
	{
		System.out.println("Main starts...");
		A.dispaly();
		A r = new A();
		r.view();
		System.out.println("Main ends...");
	}

}
class A
{
	public static void dispaly()
	{
		System.out.println("Display...");
	}
	public void view()
	{
		System.out.println("View...");
	}
}