package _I_Tried_Programmes;

import java.util.Scanner;

public class GivenNumberPresentInFibonacciOrNot {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num=sc.nextInt();
		int a=0;
		int b=1;
		int sum=0;
		boolean isPresent=false;
		for(int i=0;i<=num;i++)
		{
			if(num==sum)
			{
				isPresent=true;
			}
			a=b;
			b=sum;
			sum=a+b;
		}
		if(isPresent==true)
			System.out.println("Present");
		else
			System.out.println("Not present");
		sc.close();
	}
}
