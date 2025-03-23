package _FinalExamPractice;

import java.util.Scanner;

public class P022_SpyNumber1TonWithSLN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sln =1;
		for(int i=1;i<=n;i++)
		{
			int temp = i;
			int sum=0;
			int pro=1;
			while(temp!=0)
			{
				sum+=temp%10;
				pro*=temp%10;
				temp/=10;
			}
			if(sum==pro)
			{
				System.out.println(sln+") "+i);
				sln++;	
			}
		}
		sc.close();
	}

}
