package _FinalExamPractice;

import java.util.Scanner;

public class P026_LargestDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int temp=n;
		int lar=temp%10;
		while (temp!=0) {
			if(temp%10>lar)
			{
				lar=temp%10;
			}
			temp/=10;
		}
		System.out.println(lar);
		sc.close();
	}

}
