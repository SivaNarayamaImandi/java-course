package exception_approach_1_unhandled_programs;

import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("ENTER SIZE OF ARRAY : ");
		int s = scanner.nextInt();
		int[] i = new int[s];
		System.out.print("ENTER INSERT INDEX VALUE : ");
		int j = scanner.nextInt();
		System.out.print("ENTER THE ELEMENT : ");
		int ele = scanner.nextInt();
		i[j] = ele;
		scanner.close();
	}
}
