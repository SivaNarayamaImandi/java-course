package _ExamPractice;
import java.util.Scanner;
public class IfElseStatementCheckEvenOdd 
{
		public static void main(String[]args)
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter number : ");
			int a = sc.nextInt();
			int rem = a%2;
			if (rem==0)
			{
				System.out.println("Even");
			}
			else
			{
				System.out.println("Odd");
			}
		}
}