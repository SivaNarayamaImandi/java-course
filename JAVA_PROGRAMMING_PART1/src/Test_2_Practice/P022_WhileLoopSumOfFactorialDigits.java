package Test_2_Practice;

import java.util.Scanner;

public class P022_WhileLoopSumOfFactorialDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int temp = n;
		int sum = 0;
		while(temp!=0)
		{
			int ld = temp%10;
			int factorial = 1;
			for (int i = 1;i<=ld;i++)
			{
				factorial*=i;
			}
			sum+=factorial;
			temp/=10;
		}
		System.out.println(sum);
	}

}
