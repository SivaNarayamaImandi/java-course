package WhileDoWhileStatements;
import java.util.Scanner;
public class P028WhileLoopSplittingNumberTo2Halves2Way 
{
	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter a number : ");
			int n = sc.nextInt();
			int count = 0;
			int temp;
			for ( temp = n; temp!=0;temp/=10)
			{
				count++;
			}
			temp = n;
			if (count%2==0)
			{
				int base = 1;
				for (int i = 1;i<=count/2;i++)
				{
					base*=10;
				}
				int firstHalf = n/base; // quetient
				int secondHalf = n%base; // remainder
				System.out.println("First half of the given number is : "+firstHalf);
				System.out.println("Second Half of the given number is : "+secondHalf);
			}
			else
			{
				System.out.println("Given number can't be split into two halves");
			}
			sc.close();
		}
	}
}