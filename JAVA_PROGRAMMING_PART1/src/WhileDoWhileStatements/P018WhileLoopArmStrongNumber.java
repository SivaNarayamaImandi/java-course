package WhileDoWhileStatements;
import java.util.Scanner;
public class P018WhileLoopArmStrongNumber 
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
		if (sum==n)
		{
			System.out.println("The given "+n+" is a ARMSTRONG number");
		}
		else
		{
			System.out.println("The given"+n+" is Not a ARMSTRONG number");

		}
		sc.close();
	}
}
//153