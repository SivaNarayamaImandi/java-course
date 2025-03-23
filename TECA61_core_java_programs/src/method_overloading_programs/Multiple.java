package method_overloading_programs;

public class Multiple {

	public static void multiple(double a,double b)
	{
		double c=a*b;
		System.out.println(c);
	}
	public static void multiple(double a,int b)
	{
		double c= a*b;
		System.out.println(c);
	}
	public double multiple(int a, double b)
	{
		return a*b;
	}
	public static void main(String[] args) 
	{
		multiple(2.5,2.5);
		multiple(5.5,3);
		Multiple a = new Multiple();
		System.out.println(a.multiple(3,2.5));
	}

}
