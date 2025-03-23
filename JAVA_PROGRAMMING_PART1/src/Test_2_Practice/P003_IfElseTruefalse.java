package Test_2_Practice;

import java.util.Scanner;

public class P003_IfElseTruefalse 
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		if (n>=0)
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
	}
}