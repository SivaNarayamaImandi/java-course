package Method;

public class P002Type_2_With_Args_And_Without_ReturnType 
{
	public static void circleArea(double r)// r is Formal arguments
	{
		System.out.println("Area of Circle is : "+3.14*r*r);
	}
	public static void main(String[] args) 
	{
		System.out.println("Answer");
		circleArea(10); // 10 is Actual arguments
		circleArea(15);
		circleArea(20);
	}
}