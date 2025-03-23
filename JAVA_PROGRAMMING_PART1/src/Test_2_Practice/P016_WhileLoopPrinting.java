package Test_2_Practice;

import java.util.Scanner;

public class P016_WhileLoopPrinting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number : ");
		int n = sc.nextInt();
		while (n<=10)
		{
			System.out.println("hello");
			n++;
		}
	}

}
