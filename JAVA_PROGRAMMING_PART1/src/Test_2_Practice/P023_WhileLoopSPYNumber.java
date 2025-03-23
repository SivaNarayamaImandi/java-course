package Test_2_Practice;

import java.util.Scanner;

public class P023_WhileLoopSPYNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int temp = n;
		int sum = 0;
		int pro =1;
		while(temp!=0)
		{
			int ld = temp%10;
			sum+=ld;
			pro*=ld;
			temp/=10;
		}
		if (sum==pro)
		{
			System.out.println("SPY number");
		}
		else
		{
			System.out.println("Not a Spy number");
		}
	}

}
