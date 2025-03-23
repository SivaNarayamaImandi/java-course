package _FinalExamPractice;

import java.util.Scanner;

public class P038_TechNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int temp=n;
		int count=0;
		while (temp!=0) {
			count++;
			temp/=10;
		}
		if(count%2==0)
		{
			int base=1;
			temp=n;
			for(int i =1;i<=count/2;i++)
			{
				base*=10;
			}
			int fir=n/base;
			int sec = n%base;
			int sum=fir+sec;
			int sq =sum*sum;
			if(sq==n)
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
			System.out.println("can't split");
		}
		sc.close();
	}

}
