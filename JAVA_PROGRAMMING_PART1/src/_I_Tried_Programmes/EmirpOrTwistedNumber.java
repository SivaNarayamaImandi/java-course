package _I_Tried_Programmes;

import java.util.Scanner;

public class EmirpOrTwistedNumber 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int count = 0;
		for (int i = 1;i<=n;i++)
		{
			if (n%i==0)
				count++;
		}
		if (count==2)
		{
			int rev = 0;
			int temp = n;
			while (temp!=0)
			{
				int ld = temp%10;
				rev=rev*10+ld;
				temp/=10;
			}
			System.out.println(rev);
			int count1 = 0;
			for (int j = 1;j<=rev;j++)
			{
				if (rev%j==0)
				{
					count1++;
				}
			}
			if (count1==2)
			{
				System.out.println("Given number is EMIRP Number");
			}
			else
			{
				System.out.println("Given number is not a EMIRP Number");
			}
		}
		else
		{
			System.out.println("Given Number is not a prime number");
		}
		sc.close();
	}

}
/* must given number will be prime 
ex: 79 
1.
	First, check the given number (n) is prime or not.
	If not, break the execution and exit.
	If prime, find the reverse (r) of the given number (n).
	97
2. 
	Check the reverse number (r) is prime or not.
	If not, print number (n) is not emirp.
	If prime, print the given number (n) as an emirp number.
*/