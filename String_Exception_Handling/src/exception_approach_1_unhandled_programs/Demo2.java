package exception_approach_1_unhandled_programs;

import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("ENTER STRING : ");
		String s = scanner.next();
		System.out.print("ENTER INDEX VALUE : ");
		int i = scanner.nextInt();
		char j = s.charAt(i);
		System.out.print("CHARACTER IS : " + j);
		scanner.close();
	}
}
