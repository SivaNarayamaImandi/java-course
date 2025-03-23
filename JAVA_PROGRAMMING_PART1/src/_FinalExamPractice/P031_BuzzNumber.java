package _FinalExamPractice;

import java.util.Scanner;

public class P031_BuzzNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int temp=n;
		boolean isBuzz=false;
		while (temp!=0) {
			if(temp%7==0||temp%10==7)
			{
				isBuzz=true;
				break;
			}
			temp/=10;
		}
		if (isBuzz) {
			System.out.println(true);
		} 
		else {
			System.out.println(false);
		}
		sc.close();
	}

}
