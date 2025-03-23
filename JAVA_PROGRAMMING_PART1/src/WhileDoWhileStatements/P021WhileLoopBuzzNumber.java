package WhileDoWhileStatements;
import java.util.Scanner;
public class P021WhileLoopBuzzNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		int temp = n;
		int end = 0;
		while (temp!=0)
		{
			int ld = temp%10;
			end = ld;
			break;
		}
		if (end==7||n%7==0)
		{
			System.out.println("buzz number");
		}
		else
		{
			System.out.println("not a buzz number");
		}
		sc.close();
	}
}
//int n = 137;
//if (n%10==7||n%7==0)
//{
//	System.out.println("buzz number");
//}
//else
//{
//	System.out.println("not a buzz number");
//}