package ForLoopStatements;
import java.util.Scanner;
public class P015ForLoopCheckPrimeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		int count =0;
		for (int i = 1;i<=n;i++)
		{
			if (n%i==0)
			{
				count++;
			}
		}
		System.out.println("Count of factors "+n+" are : ");
		System.out.println(count);
		if (count==2)
		{
			System.out.println(n+" is a Prime number");
		}
		else
		{
			System.out.println(n+" is not a Prime number");
		}
		sc.close();
	}
}
//7=1,7
//another why of answer 
/*
 	System.out.print("Enter a number : ");
		int n = sc.nextInt();
		int x =0;
		for (int i = 2;i<n;i++)
		{
			if (n%i==0)
			{
				x=1;
				break;
			}
		}
		System.out.println("x is : ");
		System.out.println(x);
		if (x==0) //(x==0&&n>1)
		{
			System.out.println(n+" is a Prime number");
		}
		else
		{
			System.out.println(n+" is not a Prime number");
		}
*/