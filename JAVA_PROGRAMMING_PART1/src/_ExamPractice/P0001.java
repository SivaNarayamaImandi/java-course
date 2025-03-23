package _ExamPractice;

import java.util.Scanner;

public class P0001 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int pro =1;
		int primefact =0;
		for(int x =1;x<=n;x++)
		{
			if(n%x==0)
			{
				int count =0;
				for(int i =1;i<=x;i++)
				{
					if(x%i==0)
					{
						count++;
					}
				}
				if(count==2)
				{
					pro*=x;
					primefact++;
				}
			}
		}
		if(pro==n&&primefact==3)
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
	}

}
