package exception_approach_4_while_handled_programs;

import java.util.Scanner;

public class Demo3 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("ENTER SIZE OF ARRAY : ");
		int s = scanner.nextInt();
		int[] i = new int[s];
		System.out.print("ENTER INSERT INDEX VALUE : ");
		int j = scanner.nextInt();
		System.out.print("ENTER THE ELEMENT : ");
		int ele = scanner.nextInt();
		while(true)
		{
			try {
				i[j] = ele;
				break;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.print("RE-ENTER INSERT INDEX ELEMENT : ");
				j = scanner.nextInt();
				System.out.print("ENTER THE ELEMENT : ");
				ele = scanner.nextInt();
			}
		}
		for (int k : i) {
			System.out.println(k);
		}
	}
}
