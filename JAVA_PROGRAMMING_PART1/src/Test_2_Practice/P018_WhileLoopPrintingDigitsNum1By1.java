package Test_2_Practice;

import java.util.Scanner;

public class P018_WhileLoopPrintingDigitsNum1By1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number : ");
		int n = sc.nextInt();
		int temp = n;
		while(temp!=0)
		{
			int ld = temp%10;
			System.out.println(ld);
			temp/=10;
		}

	}

}
