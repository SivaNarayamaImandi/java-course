package exception_approach_5_forLoopUltimate_handled_programs;

import java.util.Scanner;

public class StrinIndexOutOfBoundsException {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String s = sc.next();
		System.out.print("Enter which index you want : ");
		int i = sc.nextInt();
		int choice = 1;
		while (true) {
			try {
				System.out.println(s.charAt(i));
				break;
			} catch (StringIndexOutOfBoundsException e1) {
				if (choice == 4) {
					System.out.println("You have exceeded no of chances........");
					break;
				}
				System.out.println("Your in " + choice + " chance");
				System.out.print("Enter valid index value b/w 0 to " + (s.length() - 1) + " : ");
				i = sc.nextInt();
				choice++;
			}
		}

	}
}
