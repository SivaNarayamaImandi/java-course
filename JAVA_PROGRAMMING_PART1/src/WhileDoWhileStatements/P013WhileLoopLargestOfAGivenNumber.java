package WhileDoWhileStatements;
import java.util.Scanner;
public class P013WhileLoopLargestOfAGivenNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		int temp = n;
		int largest = n%10;
		while (temp!=0)
		{
			int ld = temp%10;
			if (ld>largest)
			{
				largest=ld;
			}
			temp/=10;
		}
		System.out.println("Largest digit in a given number is : "+largest);
		sc.close();
	}
}