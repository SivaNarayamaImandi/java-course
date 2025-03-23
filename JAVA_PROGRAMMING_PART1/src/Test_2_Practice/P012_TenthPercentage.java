package Test_2_Practice;

import java.util.Scanner;

public class P012_TenthPercentage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter t marks : ");
		int t = sc.nextInt();
		System.out.println("enter e marks : ");
		int e = sc.nextInt();
		System.out.println("enter s marks : ");
		int s = sc.nextInt();
		System.out.println("enter so marks : ");
		int so = sc.nextInt();
		System.out.println("enter h marks : ");
		int h = sc.nextInt();
		System.out.println("enter m marks : ");
		int m = sc.nextInt();
		double res = (t+e+s+so+h+m)/6.0;
		System.out.println(res);
	}

}
