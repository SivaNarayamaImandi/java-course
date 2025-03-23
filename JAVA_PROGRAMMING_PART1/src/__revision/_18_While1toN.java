package __revision;

import java.util.Scanner;

public class _18_While1toN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n=sc.nextInt();
		int i=1;
		while (i<=n) {
			System.out.println(i);
			i++;
		}
		sc.close();
	}
}
