package Test_2_Practice;

import java.util.Scanner;

public class P005_IfElseIASExamEligibility 
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age ; ");
		int age = sc.nextInt();
		if (age>=21&&age<=32)
		{
			System.out.println("Eligible");
		}
		else
		{
			System.out.println("Not Eligible");
		}
	}
}