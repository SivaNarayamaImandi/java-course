package WhileDoWhileStatements;
import java.util.Scanner;
public class P038WhileLoopCoPrimeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers 1 by 1 :");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int hcf = 0;
		for (int i = 1;i<=n1&&i<=n2;i++)
		{
			if (n1%i==0&&n2%i==0)
			{
				hcf = i;
			}
		}
		if (hcf==1)
		{
			System.out.println("Co Prime number");
		}
		else
		{
			System.out.println("Not a Co Prime number");
		}
		sc.close();
	}
}