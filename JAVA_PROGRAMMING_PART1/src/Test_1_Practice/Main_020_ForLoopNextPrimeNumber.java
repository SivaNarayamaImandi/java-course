package Test_1_Practice;
import java.util.Scanner;
public class Main_020_ForLoopNextPrimeNumber 
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Engter a number : ");
		int n = sc.nextInt();
		for ( ;true; )
		{
			n++;
			int count = 0;
			for (int i = 1;i<=n;i++)
			{
				if (n%i==0)
				{
					count++;
				}
			}
			if (count==2)
			{
				System.out.println("Next prime number is : "+n);
				break;
			}
		}
	}
}