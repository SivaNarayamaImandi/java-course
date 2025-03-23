package WhileDoWhileStatements;
import java.util.Scanner;
public class P005WhileLoopProductOfDigitsNum1By1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		int product =1;
		while (n!=0) 
		{
			int ld=n%10;
			System.out.println(ld);
			n/=10;
			product*=ld;
		}
		System.out.println("Product of Digits one by one is : "+product);
		sc.close();
	}
}