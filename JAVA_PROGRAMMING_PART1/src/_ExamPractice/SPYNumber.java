package _ExamPractice;

import java.util.Scanner;

public class SPYNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		int sum = 0;
		int pro = 1;
		while(temp!=0)
		{
			sum+=(temp%10);
			pro*=(temp%10);
			temp/=10;
		}
		if (sum==pro)
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
