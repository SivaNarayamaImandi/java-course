package Test_2_Practice;

import java.util.Scanner;

public class P013_ConditionalOperators {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number : ");
		int n = sc.nextInt();
		String rem =(n%2==0)?"even":"odd";
		System.out.println(rem);
		System.out.println("enter a number : ");
		int a = sc.nextInt();
		String res = (a>0)?"+ve":"-ve";
		System.out.println(res);
	}

}
