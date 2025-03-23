package _FinalExamPractice;

import java.util.Scanner;

public class P089_Coins {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int count = n/5;
		n=n%5;
		count=count+n/2;
		n=n%2;
		count=count+n/1;
		n=n%1;
		System.out.println(count);
		sc.close();
	}

}
