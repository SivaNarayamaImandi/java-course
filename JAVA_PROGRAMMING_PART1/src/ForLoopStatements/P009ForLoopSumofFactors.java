package ForLoopStatements;
import java.util.Scanner;
public class P009ForLoopSumofFactors 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1;i<=n;i++)
		{
			if (n%i==0)
			{
				sum=sum+i;
			}
		}
		System.out.println(sum);
		sc.close();
	}
}
//10=1+2+5+10=18