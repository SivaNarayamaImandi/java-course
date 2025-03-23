package WhileDoWhileStatements;
import java.util.Scanner;
public class P026WhileLoopBinaryToDecimal 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		int temp = n;
		int sum = 0;
		int base = 1;
		while (temp!=0)
		{
			int rem = temp%10;
			int product = rem*base;
			base*=2;
			sum+=product;
			temp/=10;
		}
		System.out.println("Decimal number "+n+" is : "+sum);
		sc.close();
	}
}
//11001->25