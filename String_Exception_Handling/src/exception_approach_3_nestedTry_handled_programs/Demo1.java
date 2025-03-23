package exception_approach_3_nestedTry_handled_programs;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("ENTER FIRST NUMBER : ");
		int i = scanner.nextInt();
		System.out.print("ENTER SECOND NUMBER : ");
		int j = scanner.nextInt();

		try {
			System.out.println(i / j);
		} catch (ArithmeticException e) {
			System.out.print("ENTERED SECOND VALUE IS INVALID");
			System.out.print("\nRE-ENTER SECOND VALUE : ");
			j = scanner.nextInt();
			try {
				System.out.println(i / j);
			} catch (ArithmeticException f) {
				System.out.print("ENTERED SECOND VALUE IS INVALID");
				System.out.print("\nRE-ENTER SECOND VALUE : ");
				j = scanner.nextInt();
				System.out.println(i / j);
			}
		}

		scanner.close();
	}
}
