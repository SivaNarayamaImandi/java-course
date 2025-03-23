package ForLoopStatements;
import java.util.Scanner;
public class P007ForLoopSumOfNumbers1To10 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 1st number : ");
		int a = sc.nextInt();
		System.out.print("Enter 2nd number : ");
		int b = sc.nextInt();
		int sum = 0;
		for (int i = a;i<=b;i++)
		{
			sum+=i;
		}
		System.out.println(sum);
		sc.close();
	}
}
//1-3 = 1+2+3=6
//1-5 = 1+2+3+4+5=15