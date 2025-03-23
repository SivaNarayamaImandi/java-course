package _ExamPractice;
import java.util.Scanner;
public class IfElseStatementEligibilityIas
{
		public static void main(String[]args)
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter your age : ");
			int age = sc.nextInt();
			if (age>=21&&age<=32)
			{
				System.out.println("Your eligible for IAS exam");
			}
			else
			{
				System.out.println("Your not eligible for IAS exam");
			}
		}
}