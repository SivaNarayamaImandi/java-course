package ForLoopStatements;
import java.util.Scanner;
public class P010ForLoopCountOfFactors 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		int count = 0;
		for (int i = 1;i<=n;i++)
		{
			if (n%i==0)
			{
				count++;
			}
		}
		System.out.println("Count of factors "+n+" are : ");
		System.out.println(count);
		sc.close();
	}
}
//10=4(1,2,5,10)