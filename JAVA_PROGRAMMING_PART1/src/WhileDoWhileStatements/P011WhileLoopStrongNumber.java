package WhileDoWhileStatements;
import java.util.Scanner;
public class P011WhileLoopStrongNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
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
		System.out.println("Sum of Factorial of Digits is : "+sum);
		if (sum==n)
		{
			System.out.println(n+" is a STRONG number");
		}
		else
		{
			System.out.println(n+" is not a STRONG number");
		}
		sc.close();
	}
}
// this code same as P004_3 WhileLoopSumOfFactorialDigits
// 145