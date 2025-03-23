package _FinalExamPractice;

import java.util.Scanner;

public class P040_SplittingDigitUntilSingleDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int temp=n;
		while (temp>9) 
		{
			int sum=0;
			while(temp!=0)
			{
				int ld =temp%10;
				sum+=ld;
				temp/=10;
			}
			temp=sum;
		}
		System.out.println(temp);
		sc.close();
	}

}
