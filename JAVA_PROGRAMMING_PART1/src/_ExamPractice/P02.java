package _ExamPractice;

import java.util.Scanner;

public class P02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		int count = 0;
		while(temp!=0)
		{
			count++;
			temp/=10;
		}
		temp=n;
		int sum = 0;
		while(temp!=0)
		{
			int exp =1;
			for (int i =1;i<=count;i++)
			{
				exp*=temp%10;
			}
			sum+=exp;
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
