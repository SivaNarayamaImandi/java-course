package WhileDoWhileStatements;
import java.util.Scanner;
public class P022WhileLoopPrimeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		int count = 0;
		int i = 1;
		while (i<=n)
		{
			if (n%i==0)
			{
				count++;
			}
			i++;
		}
		if (count == 2)
		{
			System.out.println("Prime number");
		}
		else
		{
			System.out.println("Not a Prime Number");
		}
		sc.close();
	}
}
//2,3,5,7,