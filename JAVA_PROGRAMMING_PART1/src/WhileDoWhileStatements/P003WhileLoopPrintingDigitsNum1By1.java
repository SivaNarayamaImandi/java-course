package WhileDoWhileStatements;
import java.util.Scanner;
public class P003WhileLoopPrintingDigitsNum1By1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		while (n!=0) 
		{
			int ld=n%10;
			System.out.println(ld);
			n/=10;
		}
		sc.close();
	}
}