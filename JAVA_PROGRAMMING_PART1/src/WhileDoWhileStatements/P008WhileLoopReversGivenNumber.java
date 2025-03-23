package WhileDoWhileStatements;
import java.util.Scanner;
public class P008WhileLoopReversGivenNumber 
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
		System.out.println("Given number reversed : "+reverse);
		sc.close();
	}
}