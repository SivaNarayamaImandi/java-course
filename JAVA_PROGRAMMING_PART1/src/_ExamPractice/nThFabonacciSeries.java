package _ExamPractice;

import java.util.Scanner;

public class nThFabonacciSeries {

	public static void main(String[] args) {
		int a =0;
		int b =1;
		int sum =0;
		Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();	
		for (int i =1;i<=n;i++)
		{
			System.out.println(sum);
			a=b;b=sum;sum=a+b;
		}
	}

}
