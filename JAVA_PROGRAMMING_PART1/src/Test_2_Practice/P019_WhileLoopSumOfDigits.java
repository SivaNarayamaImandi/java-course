package Test_2_Practice;

import java.util.Scanner;

public class P019_WhileLoopSumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number : ");
		int n = sc.nextInt();
		int temp = n;
		int sum = 0;
		while(temp!=0)
		{
			int ld = temp%10;
			sum+=ld;
			temp/=10;
		}
		System.out.println(sum);
	}

}
