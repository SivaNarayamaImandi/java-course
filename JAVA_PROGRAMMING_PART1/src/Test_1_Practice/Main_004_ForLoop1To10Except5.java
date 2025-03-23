package Test_1_Practice;

import java.util.Scanner;

public class Main_004_ForLoop1To10Except5 
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		System.out.println("Enter a except number : ");
		int e = sc.nextInt();
		for (int i=1;i<=n;i++)
		{
			if (i!=e)
			{
				System.out.println(i);
			}	
		}
	}
}