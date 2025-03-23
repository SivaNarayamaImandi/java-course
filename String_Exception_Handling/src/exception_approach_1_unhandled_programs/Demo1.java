package exception_approach_1_unhandled_programs;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("ENTER FIRST NUMBER : ");
		int i = scanner.nextInt();
		System.out.print("ENTER SECOND NUMBER : ");
		int j = scanner.nextInt();
		System.out.println(i / j);
		scanner.close();
	}
}
