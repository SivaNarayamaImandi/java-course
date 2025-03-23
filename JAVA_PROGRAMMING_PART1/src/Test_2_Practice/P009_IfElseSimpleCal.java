package Test_2_Practice;

import java.util.Scanner;

public class P009_IfElseSimpleCal 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to simple calculator");
		System.out.println("Enter 1 for +");
		System.out.println("Enter 2 for -");
		System.out.println("Enter 3 for /");
		System.out.println("Enter 4 for %");
		System.out.println("Enter 5 for *");
		System.out.println("Enter 6 for +ve,-ve");
		System.out.println("Enter 7 for Even,Odd");
		System.out.println("*******************");
		System.out.println("enter a number : ");
		int n = sc.nextInt();
		if (n==1)
		{
			System.out.println("enter two number 1 by 1 : ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			double res = a+b;
			System.out.println(res);
		}
		else if (n==2)
		{
			System.out.println("enter two number 1 by 1 : ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			double res = a-b;
			System.out.println(res);
		}
		else if (n==3)
		{
			System.out.println("enter two number 1 by 1 : ");
			double a = sc.nextInt();
			double b = sc.nextInt();
			double res = a/b;
			System.out.println(res);
		}
		else if (n==4)
		{
			System.out.println("enter two number 1 by 1 : ");
			double a = sc.nextInt();
			double b = sc.nextInt();
			double res = a%b;
			System.out.println(res);
		}
		else if (n==5)
		{
			System.out.println("enter two number 1 by 1 : ");
			double a = sc.nextInt();
			double b = sc.nextInt();
			double res = a*b;
			System.out.println(res);
		}
	}
}