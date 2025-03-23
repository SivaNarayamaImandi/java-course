package _FinalExamPractice;

import java.util.Scanner;

public class P021_1_StrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int temp=n;
		int sum =0;
		while (temp!=0) {
			int fact=1;
			for(int i=1;i<=temp%10;i++)
			{
				fact*=i;
			}
			sum+=fact;
			temp/=10;
		}
		if (sum==n) {
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
		sc.close();
	}

}
