package __revision;

import java.util.Scanner;

public class _02_1ToN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i!=5&&i!=10)
			{
				System.out.println(i);
			}
		}
		sc.close();
	}
}
