package WhileDoWhileStatements;
import java.util.Scanner;
public class P025WhileLoopDecimalToBinary 
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
			int rem = temp%2;
			int product = rem*base;
			base*=10;
			sum+=product;
			temp/=2;
		}
		System.out.println("Binary number "+n+" is : "+sum);
		sc.close();
	}
}
//25-> 11001