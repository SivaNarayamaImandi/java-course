package WhileDoWhileStatements;
import java.util.Scanner;
public class P014WhileLoopSmallestOfAGivenNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		int temp = n;
		int smallest = n%10;
		while (temp!=0)
		{
			int ld = temp%10;
			if (ld<smallest)
			{
				smallest=ld;
			}
			temp/=10;
		}
		System.out.println("Smallest digit in a given number is : "+smallest);
		sc.close();
	}
}