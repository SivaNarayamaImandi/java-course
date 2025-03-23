package exception_approach_4_while_handled_programs;

import java.util.Scanner;

public class ArrayIndexOutOfBounds {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] i = { 10, 90, 80, 48, 781, 0 };
		System.out.print("Enter index number : ");
		int num = sc.nextInt();
		while (true) {
			try {
				System.out.println(i[num]);
				break;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Enter valid index number from 0 to " + (i.length - 1));
				System.out.print("Enter valid index number : ");
				num = sc.nextInt();
			}
		}
		sc.close();
	}
}
