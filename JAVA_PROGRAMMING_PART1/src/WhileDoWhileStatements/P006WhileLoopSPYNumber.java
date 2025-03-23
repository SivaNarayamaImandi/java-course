package WhileDoWhileStatements;
import java.util.Scanner;
public class P006WhileLoopSPYNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		int sum =0;
		int product =1;
		while (n!=0) 
		{
			int ld=n%10;
			System.out.println(ld);
			n/=10;
			product*=ld;
			sum+=ld;
		}
		if (sum==product) 
		{
			System.out.println("Given number is a SPY number");
		}
		else 
		{
			System.out.println("Given number is not a SPY number");
		}
		sc.close();
	}
}
//123-> sum==pro-> (1+2+3)6==(1*2*3)6