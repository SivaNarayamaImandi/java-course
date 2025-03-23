package WhileDoWhileStatements;
import java.util.Scanner;
public class P004_3WhileLoopSumOfFactorialDigits 
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
		sc.close();
	}
}