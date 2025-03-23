package _FinalExamPractice;

import java.util.Scanner;

public class P018_Exponantial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b =sc.nextInt();
		int p = sc.nextInt();
		int exp =1;
		for(int i=1;i<=p;i++)
		{
			exp*=b;
		}
		System.out.println(exp);
		sc.close();
	}

}
