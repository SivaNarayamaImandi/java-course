package _FinalExamPractice;

import java.util.Scanner;

public class P037_SplittingNumber2Parts {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int temp =n;
		int count=0;
		while (temp!=0) {
			count++;
			temp/=10;
		}
		if(count%2==0)
		{
			temp=n;
			int base=1;
			for(int i=1;i<=count/2;i++)
			{
				base*=10;
			}
			int fir =n/base;
			int sec=n%base;
			System.out.println(fir);
			System.out.println(sec);
		}
		else
		{
			System.out.println("can't split");
		}
		sc.close();
	}

}
