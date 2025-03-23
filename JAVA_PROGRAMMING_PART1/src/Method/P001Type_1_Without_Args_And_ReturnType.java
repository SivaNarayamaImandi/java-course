package Method;

public class P001Type_1_Without_Args_And_ReturnType 
{
	public static void walk()
	{
		System.out.println("Walk Daily");
	}
	public static void main(String[] args) 
	{
		System.out.println("Main method Starts");
		walk();
//		walk(); // We can use multiple times
//		walk();
//		walk();
		System.out.println("Main method Ends");
	}
}