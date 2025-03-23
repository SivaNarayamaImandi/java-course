package WhileDoWhileStatements;

import java.util.Scanner;

public class P001WhileLoopPrinting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a name : ");
		String n = sc.next();
		int i = 1;
		while (i <= 5) {
			// i++; //use here also
			System.out.println(n);
			i++;
		}
		sc.close();
	}
}