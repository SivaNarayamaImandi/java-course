package exception_approach_2_handled_programs;

import java.util.Scanner;

public class NullPoint {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String i = null;
		try {
			System.out.println(i.charAt(0));
		} catch (Exception e) {
			System.out.println(i);
		}
		sc.close();
	}
}
