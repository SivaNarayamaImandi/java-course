package __revision;

import java.util.Scanner;

public class _16_NextPrime {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter a number : ");
			int n = sc.nextInt();
			for(;true;n++)
			{
				int count=0;
				for(int i=1;i<=n;i++)
				{
					if(n%i==0)
						count++;
				}
				if(count==2)
				{
					System.out.println(n);
					break;
				}
			}
		}
	}
}
