package exception_approach_1_unhandled_programs;

import java.util.Scanner;

public class StrinIndexOutOfBoundsException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String s = sc.next();
		System.out.print("Enter which index you want : ");
		int i = sc.nextInt();
		System.out.println(s.charAt(i));
		sc.close();
	}
}
