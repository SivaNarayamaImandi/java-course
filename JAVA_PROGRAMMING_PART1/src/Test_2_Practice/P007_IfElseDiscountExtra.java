package Test_2_Practice;

import java.util.Scanner;

public class P007_IfElseDiscountExtra 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter bill amount : ");
		double bill = sc.nextDouble();
		bill = bill*0.8;
		System.out.println("total bill is : "+bill);
		System.out.println("your our reguler customer enter true otherwise false");
		boolean isReguler = sc.nextBoolean();
		if (isReguler==true)
		{
			System.out.println("Enter your code : ");
			int code = sc.nextInt();
			if (code==1234)
			{
				System.out.println("You have extra 10% off on bill amount");
				System.out.println("Total bill is : "+bill*0.9);
			}
			else
			{
				System.out.println("code invalid");
				System.out.println("Thank you visit again.......");
			}
		}
		else
		{
			System.out.println("Total bill is : "+bill);
			System.out.println("Thank you visit again.....");
		}
	}
}