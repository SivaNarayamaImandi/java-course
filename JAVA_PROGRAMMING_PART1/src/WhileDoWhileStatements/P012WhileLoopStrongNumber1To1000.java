package WhileDoWhileStatements;
//import java.util.Scanner;
public class P012WhileLoopStrongNumber1To1000 
{
	public static void main(String[] args) 
	{
//		Scanner sc = new Scanner(System.in);
		
		int sln = 1;
		for (int n = 1;n<=10000;n++)
		{
			int temp = n;
			int sum =0;
			while (temp!=0) 
			{
				int ld=temp%10;
				// finding factorials
				int fact = 1;
				for (int i = 1;i<=ld;i++)
				{
					fact*=i;
				}
				temp/=10;
				sum+=fact;
			}
			if (sum==n)
			{
				System.out.println(sln+") "+n);
				sln++;
			}
		}
	}
}
// this code same as P011 WhileLoopSumOfFactorialDigits