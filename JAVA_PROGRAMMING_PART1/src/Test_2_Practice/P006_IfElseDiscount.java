package Test_2_Practice;

import java.util.Scanner;

public class P006_IfElseDiscount 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter bill amount : ");
		double bill = sc.nextDouble();
		if (bill>=1000)
		{
			System.out.println("Total bill is : "+bill*0.8);
		}
		else
		{
			System.out.println("Total bill is : "+bill*0.96);
		}
	}

}