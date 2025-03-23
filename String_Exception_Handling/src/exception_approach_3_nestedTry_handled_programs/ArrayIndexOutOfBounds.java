package exception_approach_3_nestedTry_handled_programs;

import java.util.Scanner;

public class ArrayIndexOutOfBounds {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] i = { 10, 90, 80, 48, 781, 0 };
		System.out.print("Enter index number : ");
		int num = sc.nextInt();
		try {
			System.out.println(i[num]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Enter valid index number from 0 to " + (i.length - 1));
			System.out.print("Enter valid index number : ");
			num = sc.nextInt();
			try {
				System.out.println(i[num]);
			} catch (ArrayIndexOutOfBoundsException e2) {
				System.out.println("Enter valid index number from 0 to " + (i.length - 1));
				System.out.print("Enter valid index number : ");
				num = sc.nextInt();
				System.out.println(i[num]);
			}
		}
		sc.close();
	}
}
