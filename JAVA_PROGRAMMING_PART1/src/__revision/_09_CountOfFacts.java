package __revision;

import java.util.Scanner;

public class _09_CountOfFacts {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a nuber : ");
		int n = sc.nextInt();
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				count++;
		}
		System.out.println(count);
		sc.close();
	}
}
