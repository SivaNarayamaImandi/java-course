package _FinalExamPractice;

import java.util.Scanner;

public class P042_HappyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int temp =n;
		do {
			int sum=0;
			while (temp!=0) {
				int ld = temp%10;
				ld*=ld;
				sum+=ld;
				temp/=10;
			}
			temp=sum;
		} while (temp>9);
		if(temp==1)
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
