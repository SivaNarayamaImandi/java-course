package ForLoopStatements;
import java.util.Scanner;
public class P016ForLoopOnlyPrimeNumbers 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		
		for (int x = 1; x<=n;x++)
		{
			{
				int count =0; //counting the factors.
				for (int i = 1;i<=x;i++)
				{
					if (x%i==0)
					{
						count++;
					}
				}
				if (count == 2) //factors are only 2 then it is prime and print.
				{
					System.out.println(x);
				}
			}
		}
		sc.close();
	}
}
/*1-user asked number before primenumber printed
ex: 10
1-10=2,3,5,7,
*/