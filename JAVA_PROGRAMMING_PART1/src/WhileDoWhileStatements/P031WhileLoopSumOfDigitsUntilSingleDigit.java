package WhileDoWhileStatements;
import java.util.Scanner;
public class P031WhileLoopSumOfDigitsUntilSingleDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		int temp = n;
		while (temp>9)
		{
			int sum =0;
			while (temp!=0) 
			{
				int ld=temp%10;
				temp/=10;
				sum+=ld;
			}
			temp=sum;
		}
		System.out.println("Sum Of Digits Until Number "+n+" Becomes Single Digit : "+temp);
		sc.close();
	}
}
//325->2+3+5=10->1+0=1