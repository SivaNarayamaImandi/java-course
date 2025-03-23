package Test_1_Practice;
import java.util.Scanner;
public class Main_015_ForLoopCheckPrimeNumber 
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int count = 0;
		for (int i = 1;i<=n;i++)
		{
			if (n%i==0)
			{
				//System.out.println(i);
				count++;
			}
		}
		System.out.println("Total factros of a given number is : "+count);
		if (count==2)
		{
			System.out.println("Entered number "+n+" is PRIME number");
		}
		else
		{
			System.out.println("Enetred number "+n+" is NOT PRIME number");
		}
	}
}