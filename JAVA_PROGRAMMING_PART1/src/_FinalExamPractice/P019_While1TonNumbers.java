package _FinalExamPractice;

import java.util.Scanner;

public class P019_While1TonNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int i =1;
		while (i<=n)
		{
			System.out.println(i);
			i++;
		}
		sc.close();
	}

}
