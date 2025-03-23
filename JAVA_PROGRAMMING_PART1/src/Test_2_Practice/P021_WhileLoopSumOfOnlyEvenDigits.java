package Test_2_Practice;

import java.util.Scanner;

public class P021_WhileLoopSumOfOnlyEvenDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number : ");
		int n = sc.nextInt();
		int temp = n;
		int sum = 0;
		while(temp!=0)
		{
			int ld = temp%10;
			if (ld%2==0)
			{
			sum+=ld;
			}
			temp/=10;
		}
		System.out.println(sum);
	}

}
