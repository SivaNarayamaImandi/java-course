package Method;

import java.util.Scanner;

public class P008Pair {
	public static boolean rep(int n)
	{
		boolean isRep=false;
		int temp1 =n;
		while(temp1!=0)
		{
			int ld1 = temp1%10;
			temp1/=10;
			int temp2=temp1;
			while(temp2!=0)
			{
				int ld2 = temp2%10;
				if(ld1==ld2)
				{
					isRep=true;
					break;
				}
				temp2/=10;
			}
		}
		return isRep;
	}
	
	public static int count(int sum,int n)
	{
		int count = 0;
		int temp1=n;
		while(temp1!=0)
		{
			int ld1 = temp1%10;
			temp1/=10;
			int temp2 = temp1;
			while(temp2!=0)
			{
				int ld2 = temp2%10;
				if((ld2+ld1)==sum)
				{
					count++;
				}
				temp2/=10;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = sc.nextInt();
		int n = sc.nextInt();
		if(rep(n)==false)
		{
			System.out.println(count(sum,n));
		}
		else
		{
			System.out.println("invalid input");
		}
		sc.close();
	}

}
