package __revision;

import java.util.Scanner;

public class _06_SumOfNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		int sum =0;
		for(int i=1;i<=n;i++)
		{
			sum+=i;
		}
		System.out.println(sum);
		sc.close();
	}
}
