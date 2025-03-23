package Test_1_Practice;
import java.util.Scanner;
public class Main_008_ForLoopFactorsOfAGivenNumbers 
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		for (int i = 1;i<=n;i++)
		{
			if (n%i==0)
			{
				System.out.println(i);
			}
		}
	}
}
