package method_overloading_programs;

public class Addition {

	public int addition(int a,int b)
	{
		int c =a+b;
		return c;
	}
	public double addition(int a,double b)
	{
		double c =a+b;
		return c;
	}
	public double addition(double a,double b,int c)
	{
		double d = a+b+c;
		return d;
	}
	public static void main(String[] args) 
	{
		Addition a = new Addition();
		System.out.println(a.addition(1, 2));
		System.out.println(a.addition(5.3, 4.3, 5));
		System.out.println(a.addition(1, 4.8));
	}
}
