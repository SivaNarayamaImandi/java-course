package exception_approach_1_unhandled_programs;

import java.util.Scanner;

public class NullPoint {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String i = null;
		System.out.println(i.charAt(0));
		sc.close();
	}
}
