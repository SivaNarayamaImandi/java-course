package WhileDoWhileStatements;
import java.util.Scanner;
public class P041NonFibonacciSeries 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Starting 2 numbers 1 by 1 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.print("Enter how long you want : ");
		int n = sc.nextInt();
		int sum = 0;
		for (int i =0;i<=n;i++)
		{
			if (i!=sum)
			{
				System.out.println(i);
			}
			else
			{
				sum=a+b;
				a=b;
				b=sum;
			}
		}
		sc.close();
	}
}
//n=5->4