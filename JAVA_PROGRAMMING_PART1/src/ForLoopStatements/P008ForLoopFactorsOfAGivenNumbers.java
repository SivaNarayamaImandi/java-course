package ForLoopStatements;
import java.util.Scanner;
public class P008ForLoopFactorsOfAGivenNumbers 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		System.out.println("Factors of "+n+" are : ");
		for (int i = 1;i<=n;i++)
		{
			if (n%i==0)
			{
				System.out.println(i);
			}
		}
		sc.close();
	}
}
//10=1,2,5,10