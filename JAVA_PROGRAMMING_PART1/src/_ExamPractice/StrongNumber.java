package _ExamPractice;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		int sum = 0;
		while (temp!=0)
		{
			int fac = 1;
			for (int i =1;i<=(temp%10);i++)
			{
				fac*=i;
			}
			sum+=fac;
			temp/=10;
		}
		if (sum==n)
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
		sc.close();
	}

}
