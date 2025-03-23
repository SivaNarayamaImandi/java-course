package WhileDoWhileStatements;
import java.util.Scanner;
public class P029WhileLoopTechNumber 
{
	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter a number : ");
			int n = sc.nextInt();
			int count = 0;
			int temp;
			for (temp = n;temp!=0;temp/=10)
			{
				count++;
			}
			temp = n;
			if (count %2==0)
			{
				int base = 1;
				for (int i = 1;i<=count/2;i++)
				{
					base*=10;
				}
				int firstHalf = n/base;
				int secondHalf = n%base;
				int sum = firstHalf+secondHalf;
				int square = sum*sum;
				if (square==n)
				{
					System.out.println("Given number "+n+" is TECH Number");
				}
				else
				{
					System.out.println("Given number "+n+" is NOT a TECH Number");
				}
			}
			else
			{
				System.out.println("Given number can't be split into two halves");
			}
			sc.close();
		}
	}
}
//2025 -> 20,25 -> 20+25=45 -> 45*45=2025