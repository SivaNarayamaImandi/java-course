package Test_2_Practice;

import java.util.Scanner;

public class P011_SumOf4Num {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 4 values 1 by 1 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		double res = a+b+c+d;
		System.out.println(res);
	}

}
