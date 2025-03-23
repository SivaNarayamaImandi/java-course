package WhileDoWhileStatements;
import java.util.Scanner;
public class P043WhileLoopSphenicNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		int product = 1;
		int primeFactorsCount = 0;
		for (int x = 1;x<=n;x++)
		{
			if (n%x==0)
			{
				int count = 0;
				for (int i = 1;i<=x;i++)
				{
					if(x%i==0)
					{
						count++;
					}
				}
				if (count == 2)
				{
					product*=x;
					primeFactorsCount++;
				}
			}
		}
		if (product==n&&primeFactorsCount==3)
		{
			System.out.println(n+" is Sphenic Number");
		}
		else
		{
			System.out.println(n+" is Not Sphenic Number");
		}
		sc.close();
	}
}