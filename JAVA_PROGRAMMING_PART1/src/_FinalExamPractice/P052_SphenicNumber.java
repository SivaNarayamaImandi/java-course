package _FinalExamPractice;

import java.util.Scanner;

public class P052_SphenicNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int pro=1;
		int primFcat =0;
		for(int x=1;x<=n;x++)
		{
			if(n%x==0)
			{
				int count=0;
				for(int i=1;i<=x;i++)
				{
					if(x%i==0)
					{
						count++;
					}
				}
				if(count==2)
				{
					pro*=x;
					primFcat++;
				}
			}
		}
		if(pro==n&&primFcat==3)
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
		sc.close();
	}

}
