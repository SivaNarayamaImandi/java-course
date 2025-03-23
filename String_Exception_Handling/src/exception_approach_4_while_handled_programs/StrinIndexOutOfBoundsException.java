package exception_approach_4_while_handled_programs;

import java.util.Scanner;

public class StrinIndexOutOfBoundsException {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String s = sc.next();
		System.out.print("Enter which index you want : ");
		int i = sc.nextInt();
		while (true) {
			try {
				System.out.println(s.charAt(i));
				break;
			} catch (StringIndexOutOfBoundsException e1) {
				System.out.print("Enter valid index value b/w 0 to " + (s.length() - 1) + " : ");
				i = sc.nextInt();
			}
		}

	}
}
