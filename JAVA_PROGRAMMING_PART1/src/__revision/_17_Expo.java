package __revision;

import java.util.Scanner;

public class _17_Expo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a base : ");
		int b = sc.nextInt();
		System.out.print("Enter a power : ");
		int p = sc.nextInt();
		int exp=1;
		for(int i=1;i<=p;i++)
		{
			exp*=b;
		}
		System.out.println(exp);
		sc.close();
	}
}
