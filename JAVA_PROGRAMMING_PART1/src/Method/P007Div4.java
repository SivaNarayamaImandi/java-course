package Method;

import java.util.Scanner;

public class P007Div4 {
	public static int divFour(int m,int n)
	{
		int sum1=0;
		int sum2=0;
		for(int i=1;i<=m;i++)
		{
			if(i%n==0)
			{
				sum1+=i;
			}
			else
			{
				sum2+=i;
			}
		}
		int ans;
		if(sum1>sum2)
		{
			ans=sum1-sum2;
		}
		else
		{
			ans=sum2-sum1;
		}
		return ans;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int m = sc.nextInt();;
		System.out.println(divFour(m ,n));
		sc.close();
	}

}