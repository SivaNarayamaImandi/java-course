package Test_1_Practice;
import java.util.Scanner;
public class Main_011_ForLoopPerfectFactors 
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1;i<=n/2;i++)
		{
			if (n%i==0)
			{
				sum+=i;
				System.out.println(i);
			}
		}
		System.out.println("total factors of a given "+n+" is : "+sum);
		if (sum == n)
		{
			System.out.println(n+" is perfect number");
		}
		else
		{
			System.out.println(n+" is not perfect number");
		}
	}
}