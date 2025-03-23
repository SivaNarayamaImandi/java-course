package _ExamPractice;

import java.util.Scanner;

public class P05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		int sum =0;
		int base = 1;
		while(temp!=0)
		{
			int pro = temp%10*base;
			base*=2;
			sum+=pro;
			temp/=10;
		}
		System.out.println(sum);
		
		sc.close();
	}

}
