package exception_approach_4_while_handled_programs;

import java.util.Scanner;

public class Demo1 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("ENTER FIRST NUMBER : ");
		int i = scanner.nextInt();
		System.out.print("ENTER SECOND NUMBER : ");
		int j = scanner.nextInt();
		while(true)
		{
			try {
				System.out.println(i / j);
				break;
			} catch (ArithmeticException e) {
				System.out.print("ENTERED SECOND VALUE IS INVALID");
				System.out.print("\nRE-ENTER SECOND VALUE : ");
				j = scanner.nextInt();
			}
			
		}
	}
}
