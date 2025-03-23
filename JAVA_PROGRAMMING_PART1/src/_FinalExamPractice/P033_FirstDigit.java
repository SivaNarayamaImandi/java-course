package _FinalExamPractice;

import java.util.Scanner;

public class P033_FirstDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int temp=n;
		int fir=0;
		while(temp>=10)
		{
			fir =temp/=10;
		}
		System.out.println(fir);
		sc.close();
	}

}
