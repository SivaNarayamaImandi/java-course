package Test_2_Practice;

import java.util.Scanner;

public class P017_WhileLoopCountingDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value : ");
		int n = sc.nextInt();
		int count =0;
		while(n!=0)
		{
			count++;
			n/=10;
		}
		System.out.println(count);
	}

}
