package WhileDoWhileStatements;
import java.util.Scanner;
public class P017WhileLoopSumOfExponentialOfEachDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		int temp = n;
		int count = 0;
		while (temp!=0)
		{
			count++;
			temp/=10;
		}
		int sum = 0;
		temp = n; // re-initializing 'temp with n'
		while (temp!=0)
		{
			int ld = temp%10;
			int exponantial = 1;
			for (int i = 1;i<=count;i++)
			{
				exponantial*=ld;
			}
			sum+=exponantial;
			temp/=10;
		}
		System.out.println("Sum Of Exponential Of Each Digit is : "+sum);
		sc.close();
	}
}