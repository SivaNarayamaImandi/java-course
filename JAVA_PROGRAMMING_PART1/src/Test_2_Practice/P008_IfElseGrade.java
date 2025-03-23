package Test_2_Practice;

import java.util.Scanner;

public class P008_IfElseGrade 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your grade : ");
		char grade = sc.next().charAt(0);
		if (grade=='A')
		{
			System.out.println("1st Rank");
		}
		else if (grade=='B')
		{
			System.out.println("2nd Rank");
		}
		else if (grade=='C')
		{
			System.out.println("3rd Rank");
		}
		else if (grade=='D')
		{
			System.out.println("1st Class");
		}
		else if (grade=='E')
		{
			System.out.println("2nd Class");
		}
		else if (grade=='F')
		{
			System.out.println("failled");
		}
		else
		{
			System.out.println("invalid input");
		}
	}
}