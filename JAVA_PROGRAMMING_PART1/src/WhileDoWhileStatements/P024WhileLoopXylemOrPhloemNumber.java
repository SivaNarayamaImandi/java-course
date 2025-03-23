package WhileDoWhileStatements;
import java.util.Scanner;
public class P024WhileLoopXylemOrPhloemNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		int temp = n;
		int sumExtreme = 0;
		int sumMean = 0;
		while (temp!=0)
		{
			int ld = temp%10;
			if (temp<10||temp==n)// temp<10 = FirstDigit, temp==n = LastDigit
			{
				sumExtreme+=ld;
			}
			else
			{
				sumMean+=ld;
			}
			temp/=10;
		}
		if (sumExtreme==sumMean)
		{
			System.out.println("Given number is XYLEM number");
		}
		else
		{
			System.out.println("Given number is PHLOEM number");
		}
		sc.close();
	}
}
//2334-> 2+4=3+3