package _FinalExamPractice;

import java.util.Scanner;

public class P027_SmallerDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp =n;
		int sma = temp%10;
		while (temp!=0) {
			if(temp%10<sma)
			{
				sma=temp%10;
			}
			temp/=10;
		}
		System.out.println(sma);
		sc.close();
	}

}
