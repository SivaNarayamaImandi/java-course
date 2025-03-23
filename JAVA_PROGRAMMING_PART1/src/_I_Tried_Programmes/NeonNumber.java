package _I_Tried_Programmes;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int sq=n*n;
		int temp = sq;
		int sum = 0;
		while (temp!=0)
		{
			int ld = temp%10;
			sum+=ld;
			temp/=10;
		}
		if (sum == n)
		{
			System.out.println("NEON Number");
		}
		else
		{
			System.out.println("Not A NEON number");
		}
		sc.close();
	}

}
/* ex : 9,45
9*9=81
8+1=9 -> true

45*45=2025
2+0+2+5=9 -> false
*/