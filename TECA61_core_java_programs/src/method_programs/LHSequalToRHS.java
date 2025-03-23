package method_programs;

public class LHSequalToRHS {

	public static double lhs(int a,int b)
	{
		double lhs = (a*a)+(b*b);
		return lhs;
	}
	public static double rhs(int a,int b)
	{
		double rhs = ((a+b)*(a+b))-2*a*b;
		return rhs;
	}
	public static void main(String[] args) 
	{
		if(lhs(2,2)==rhs(2,2))
		{
			System.out.println("Hence L.H.S is equal to R.H.S");
		}
		else
		{
			System.out.println("Hence L.H.S is NOT equal to R.H.S");
		}
	}

}
