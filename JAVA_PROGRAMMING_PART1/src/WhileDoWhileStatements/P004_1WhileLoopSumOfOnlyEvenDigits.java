package WhileDoWhileStatements;
import java.util.Scanner;
public class P004_1WhileLoopSumOfOnlyEvenDigits 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		int temp = n;
		int sum =0;
		while (temp!=0) 
		{
			int ld=temp%10;
			if (ld%2==0)
			{
				sum+=ld;
			}
			System.out.println(ld);
			temp/=10;
		}
		System.out.println("Sum of Digits one by one is : "+sum);
		sc.close();
	}
}