package exception_approach_3_nestedTry_handled_programs;

import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("ENTER SIZE OF ARRAY : ");
		int s = scanner.nextInt();
		int[] i = new int[s];
		System.out.print("ENTER INSERT INDEX ELEMENT : ");
		int j = scanner.nextInt();
		System.out.print("ENTER THE ELEMENT : ");
		int ele = scanner.nextInt();

		try {
			i[j] = ele;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.print("RE-ENTER INSERT INDEX ELEMENT : ");
			j = scanner.nextInt();
			System.out.print("ENTER THE ELEMENT : ");
			ele = scanner.nextInt();
			try {
				i[j] = ele;
			} catch (ArrayIndexOutOfBoundsException f) {
				System.out.print("RE-ENTER INSERT INDEX ELEMENT : ");
				j = scanner.nextInt();
				System.out.print("ENTER THE ELEMENT : ");
				ele = scanner.nextInt();
				i[j] = ele;
			}
		}
		for (int k : i) {
			System.out.println(k);
		}

		scanner.close();
	}
}
