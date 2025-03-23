package WhileDoWhileStatements;
import java.util.Scanner;
public class P027WhileLoopSplittingNumberTo2Halves 
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
		temp = n;
		if (count%2==0)
		{
			int reverse = 0;
			for (int i = 1;i<=count/2;i++)
			{
				int ld = temp%10;
				reverse = reverse*10+ld;
				temp/=10;
			}
			int firstHalf = temp;
			int secondHalf = 0;
			while (reverse!=0)
			{
				int ld = reverse%10;
				secondHalf = secondHalf*10+ld;
				reverse/=10;
			}
			System.out.println("First half of the given number is : "+firstHalf);
			System.out.println("Second Half of the given number is : "+secondHalf);
		}
		else
		{
			System.out.println("Given number can't split into two halves");
		}
		sc.close();
	}
}
//1234->12,34