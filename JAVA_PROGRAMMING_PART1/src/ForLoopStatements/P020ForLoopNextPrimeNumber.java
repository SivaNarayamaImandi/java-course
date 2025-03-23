package ForLoopStatements;
import java.util.Scanner;
public class P020ForLoopNextPrimeNumber 
{
	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter n Value : ");
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
					System.out.println("Next Prime number is : "+n);
					break;
				}
			}
			sc.close();
		}
	}
}