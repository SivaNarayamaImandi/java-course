package exception_approach_5_forLoopUltimate_handled_programs;

import java.util.Scanner;

public class ArrayIndexOutOfBounds {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] i = { 10, 90, 80, 48, 781, 0 };
		System.out.print("Enter index number : ");
		int num = sc.nextInt();
		int chance = 1;
		while (true) {
			try {
				System.out.println(i[num]);
				break;
			} catch (ArrayIndexOutOfBoundsException e) {
				if (chance == 4) {
					System.out.println("\nYou have exceeded limits........");
					break;
				}
				System.out.println("\nYour in " + chance + " chance");
				System.out.println("Enter valid index number from 0 to " + (i.length - 1));
				System.out.print("Enter valid index number : ");
				num = sc.nextInt();
				chance++;
			}
		}
		sc.close();
	}
}
