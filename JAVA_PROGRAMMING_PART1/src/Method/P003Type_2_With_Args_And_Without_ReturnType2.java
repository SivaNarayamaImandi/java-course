package Method;

public class P003Type_2_With_Args_And_Without_ReturnType2 
{
	public static void rectangleArea(double l,double b)
	{
		System.out.println("Area of Rectangle is : "+l*b);
	}
	public static void main(String[] args) 
	{
		System.out.println("Answer");
		rectangleArea(10,15);
		rectangleArea(15,20);
		rectangleArea(20,25);
	}
}