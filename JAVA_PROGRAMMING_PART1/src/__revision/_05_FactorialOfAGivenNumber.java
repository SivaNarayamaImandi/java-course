package __revision;

import java.util.Scanner;

public class _05_FactorialOfAGivenNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		int fact=1;
		for(int i =1;i<=n;i++)
		{
			fact*=i;
		}
		System.out.println(fact);
		sc.close();
	}
}
