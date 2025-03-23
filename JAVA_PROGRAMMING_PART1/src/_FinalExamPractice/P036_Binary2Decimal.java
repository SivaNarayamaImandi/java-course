package _FinalExamPractice;

import java.util.Scanner;

public class P036_Binary2Decimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int temp = n;
		int pro,base=1;
		int sum=0;
		while (temp!=0) {
			int ld = temp%10;
			pro=ld*base;
			base*=2;
			sum+=pro;
			temp/=10;
		}
		System.out.println(sum);
		sc.close();
	}

}
