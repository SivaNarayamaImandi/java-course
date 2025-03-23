package exception_approach_1_unhandled_programs;

import java.util.Scanner;

public class ArrayIndexOutOfBounds {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] i = { 10, 90, 80, 48, 781, 0 };
		System.out.print("Enter index number : ");
		int num = sc.nextInt();
		System.out.println(i[num]);
		sc.close();
	}
}
