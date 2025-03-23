package Test_1_Practice;

import java.util.Scanner;

public class Main_005_ForLoopUserName20times 
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user name : ");
		String name = sc.next();
		for (int i=1;i<=20;i++)
		{
			System.out.println(i+". "+name);
		}
	}
}
