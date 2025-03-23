package Test_2_Practice;

import java.util.Scanner;

public class P025_WhileLoopReversGivenNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number : ");
		int n = sc.nextInt();
		int temp = n;
		int rev = 0;
		while(temp!=0)
		{
			int ld = temp%10;
			rev = rev*10+ld;
			temp/=10;
		}
		System.out.println(rev);
	}

}
