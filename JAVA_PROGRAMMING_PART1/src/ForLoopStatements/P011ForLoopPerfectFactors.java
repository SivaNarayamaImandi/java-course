package ForLoopStatements;
import java.util.Scanner;
public class P011ForLoopPerfectFactors 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1;i<=n/2;i++) // Instead i<n (also you can use)
		{
			if (n%i==0)
			{
				sum=sum+i;
			}
		}
		System.out.println("Sum of factors of given number "+n+" is : "+sum);
		if (n==sum)
		{
			System.out.println(n+" is a perfect number");
		}
		else
		{
			System.out.println(n+" is not a perfect number");
		}
		sc.close();
	}
}
//6=1+2+3=6