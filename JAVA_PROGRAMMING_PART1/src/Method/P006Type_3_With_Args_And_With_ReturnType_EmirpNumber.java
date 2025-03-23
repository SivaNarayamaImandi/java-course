package Method;
import java.util.Scanner;
public class P006Type_3_With_Args_And_With_ReturnType_EmirpNumber 
{
	public static int twistedPrime(int n)
	{
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
		}
		return count;
	}
	public static void main(String[] args) 
	{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a number : ");
			int n = sc.nextInt();
			if (twistedPrime(n)==2)
			{
				System.out.println("Twisted Number (or) EMIRP Number");
			}
			else
			{
				System.out.println("Not a Twisted Number (or) EMIRP Number");
			}
			sc.close();
	}

}
