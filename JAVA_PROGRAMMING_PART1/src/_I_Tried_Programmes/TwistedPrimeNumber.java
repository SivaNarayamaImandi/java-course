package _I_Tried_Programmes;
import java.util.Scanner;
public class TwistedPrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2) 
		{
			int rev =0;
			int temp = n;
			while(temp!=0)
			{
				int ld = temp%10;
				rev=rev*10+ld;
				temp/=10;
			}
			int count1=0;
			for(int j=1;j<=rev;j++)
			{
				if(j%rev==0)
				{
					count1++;
				}
			}
			if(count1==2)
			{
				System.out.println("TwistedPrimeNumber");
			}
			else
			{
				System.out.println("not a TwistedPrimeNumber");
			}
		}
		else
		{
			System.out.println("not a prime number");
		}
	}

}
