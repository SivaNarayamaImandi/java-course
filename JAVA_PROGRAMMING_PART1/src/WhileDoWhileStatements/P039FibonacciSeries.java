package WhileDoWhileStatements;
import java.util.Scanner;
public class P039FibonacciSeries 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Starting 2 numbers 1 by 1 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.print("Enter how long you want : ");
		int n = sc.nextInt();
		int sum = 0;
		for (int i =1;i<=n;i++)
		{
			System.out.println(sum);
			a=b;
			b=sum;
			sum=a+b;
		}
		sc.close();
	}
}
/*  0
	1
	1
	2
	3
*/