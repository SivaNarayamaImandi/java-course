package _ExamPractice;
import java.util.Scanner;
public class IfElseStatementDiscount 
{
		public static void main(String[]args)
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter your total bill amount : ");
			int bill = sc.nextInt();
			if (bill>=10000)
			{
				System.out.println("Your final bill amount is : "+0.90*bill);
			}
			else
			{
				System.out.println("Your final bill amount is : "+0.96*bill);
			}
		}
}