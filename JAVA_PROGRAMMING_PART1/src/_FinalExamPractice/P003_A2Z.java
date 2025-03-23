package _FinalExamPractice;

import java.util.Scanner;

public class P003_A2Z {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char n = sc.next().charAt(0);
		for (char i='A';i<=n;i++)
		{
			System.out.println(i);
		}
		sc.close();
	}

}
