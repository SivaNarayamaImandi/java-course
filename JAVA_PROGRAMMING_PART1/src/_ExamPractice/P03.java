package _ExamPractice;

import java.util.Scanner;

public class P03 {

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
		if (count%2==0)
		{
			int base = 1;
			for (int i = 1;i<=count/2;i++)
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
			System.out.println(false);
		}
		sc.close();
	}

}
