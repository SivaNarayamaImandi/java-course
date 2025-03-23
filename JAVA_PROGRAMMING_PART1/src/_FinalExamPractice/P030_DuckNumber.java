package _FinalExamPractice;

import java.util.Scanner;

public class P030_DuckNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp=n;
		boolean isDuck=false;
		while (temp!=0) {
			if(temp%10==0)
			{
				isDuck=true;
				break;
			}
			temp/=10;
		}
		if (isDuck) {
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
		sc.close();
	}

}
