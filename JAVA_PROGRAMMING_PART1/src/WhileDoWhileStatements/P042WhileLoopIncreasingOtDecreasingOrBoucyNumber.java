package WhileDoWhileStatements;
import java.util.Scanner;
public class P042WhileLoopIncreasingOtDecreasingOrBoucyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		int temp = n;
		int cd = 10;
		boolean isIncreasing = true;
		while (temp!=0)
		{
			int nd = temp%10;
			if (nd<=cd)
			{
				cd=nd;
			}
			else
			{
				isIncreasing=false;
				break;
			}
			temp/=10;
		}
		temp = n;
		cd = 0;
		boolean isDecreasing = true;
		while (temp!=0)
		{
			int nd = temp%10;
			if (nd>=cd)
			{
				cd=nd;
			}
			else
			{
				isDecreasing=false;
				break;
			}
			temp/=10;
		}
		if (isIncreasing)
		{
			System.out.println(n+" is INCREASING");
		}
		else if (isDecreasing)
		{
			System.out.println(n+" is DECREASING");
		}
		else
		{
			System.out.println(n+" is BOUNCING");
		}
		sc.close();
	}
}
//123->inc
//3221->dec
//123654->bou