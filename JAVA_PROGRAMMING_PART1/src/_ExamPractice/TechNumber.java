package _ExamPractice;

import java.util.Scanner;

public class TechNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp;
		int count = 0;
		for (temp = n;temp!=0;temp/=10)
		{
			count++;
		}
		temp =n;
		if (count%2==0)
		{
			int base =1;
			for (int i =1;i<=count/2;i++)
			{
				base*=10;
			}
			int fir = n/base;
			int sec = n%base;
			int sum = fir+sec;
			int sqe = sum*sum;
			if (sqe==n)
			{
				System.out.println(true);
			}
			else
			{
				System.out.println(false);
			}
		}
		else
		{
			System.out.println("no");
		}
		
	}

}
