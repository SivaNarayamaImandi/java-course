package _FinalExamPractice;

import java.util.Scanner;

public class P035_Decimal2Binary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int pro,base =1;
		int sum =0;
		int temp =n;
		while (temp!=0) {
			int ld = temp%2;
			pro = ld*base;
			base*=10;
			temp/=2;
			sum+=pro;
		}
		System.out.println(sum);
		sc.close();
	}

}
