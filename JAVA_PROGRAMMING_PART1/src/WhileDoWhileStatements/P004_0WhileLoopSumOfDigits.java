package WhileDoWhileStatements;
import java.util.Scanner;
public class P004_0WhileLoopSumOfDigits 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		int sum =0;
		while (n!=0) 
		{
			int ld=n%10;
			System.out.println(ld);
			n/=10;
			sum+=ld;
		}
		System.out.println("Sum of Digits one by one is : "+sum);
		sc.close();
	}
}