package WhileDoWhileStatements;
import java.util.Scanner;
public class P009WhileLoopPalidromNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		int temp = n;
		int reverse = 0;
		while (temp!=0) 
		{
			int lastDigit = temp%10;
			reverse = reverse*10+lastDigit;
			temp/=10;
		}
		if (reverse==n)
		{
			System.out.println("Reversed number is : "+reverse);
			System.out.println(n+" is a PALIDROM number");
		}
		else
		{
			System.out.println("Reversed number is : "+reverse);
			System.out.println(n+" is NOT a PALIDROM number");
		}
		sc.close();
	}
}
//9669,121,151