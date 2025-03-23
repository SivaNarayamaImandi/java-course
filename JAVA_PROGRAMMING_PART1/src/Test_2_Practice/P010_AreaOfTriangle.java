package Test_2_Practice;

import java.util.Scanner;

public class P010_AreaOfTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter base value : ");
		double b = sc.nextDouble();
		System.out.println("enter height value : ");
		double h = sc.nextDouble();
		double area = 0.5*b*h;
		System.out.println(area);
	}

}
