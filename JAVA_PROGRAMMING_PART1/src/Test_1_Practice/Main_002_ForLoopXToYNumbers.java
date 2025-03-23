package Test_1_Practice;

import java.util.Scanner;

public class Main_002_ForLoopXToYNumbers 
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number : ");
		int firstNumber = sc.nextInt();
		System.out.println("Enter second number : ");
		int secondNumber = sc.nextInt();
		for (int i=firstNumber;i<=secondNumber;i++)
		{
			System.out.println(i);
		}
	}
}