package _FinalExamPractice;

import java.util.Scanner;

public class P002_1To10Except5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i!=5)
			{
				System.out.println(i);
			}
		}
		sc.close();
	}

}
