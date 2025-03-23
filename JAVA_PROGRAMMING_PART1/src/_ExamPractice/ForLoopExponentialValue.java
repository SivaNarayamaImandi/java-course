package _ExamPractice;

import java.util.Scanner;

public class ForLoopExponentialValue 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter base value :");
		int b = sc.nextInt();
		System.out.println("enter power value : ");
		int p = sc.nextInt();
		int prod = 1;
		for (int i =1;i<=p;i++)
		{
			prod*=b;
		}
		System.out.println(prod);
	}
}