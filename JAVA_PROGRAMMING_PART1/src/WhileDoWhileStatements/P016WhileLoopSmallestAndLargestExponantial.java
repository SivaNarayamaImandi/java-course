package WhileDoWhileStatements;
import java.util.Scanner;
public class P016WhileLoopSmallestAndLargestExponantial 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		int temp = n;
		int smallest = n%10;
		int largest = n%10;
		while (temp!=0)
		{
			int ld = temp%10;
			if (ld<smallest)
			{
				smallest=ld;
			}
			if (ld>largest)
			{
				largest=ld;
			}
			temp/=10;
		}
			System.out.println("Smallest digit in a given number is : "+smallest);
			System.out.println("Largest digit in a given number is : "+largest);
			int exponantial = 1;
			for (int i =1;i<=largest;i++)
			{
				exponantial*=smallest;
			}
			System.out.println(smallest+" to the power "+largest+" is : "+exponantial);
			sc.close();
	}
}