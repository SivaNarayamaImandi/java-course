package _FinalExamPractice;

import java.util.Scanner;

public class P011_Tables {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i=1;i<=10;i++)
		{
			System.out.println(n+"*"+i+"="+i*n);
		}
		sc.close();
	}

}
