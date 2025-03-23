package _FinalExamPractice;

import java.util.Scanner;

public class P032_WhileLoopPrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i =1;
		int count=0;
		while(i<=n)
		{
			if(n%i==0)
			{
				count++;
			}
			i++;
		}
		if(count==2)
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
