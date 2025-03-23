package _FinalExamPractice;

import java.util.Scanner;

public class P014_PrimeNumbersBeforeUserAsked {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		for(int x=1;x<=n;x++)
		{
			int count =0;
			for(int i=1;i<=x;i++)
			{
				if(x%i==0)
				{
					count++;
				}
			}
			if (count==2)
			{
				System.out.println(x);
			}
		}
		sc.close();
	}

}