package _FinalExamPractice;

import java.util.Scanner;

public class P049_NonFibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a= 0;
		int b=1;
		int sum=0;
		for(int i=0;i<=n;i++)
		{
			if(i!=sum)
			{
				System.out.println(i);
			}
			else
			{
				sum=a+b;
				a=b;
				b=sum;
			}
		}
		sc.close();
		
	}

}
