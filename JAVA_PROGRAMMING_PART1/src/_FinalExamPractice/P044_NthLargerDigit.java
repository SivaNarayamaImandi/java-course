package _FinalExamPractice;

import java.util.Scanner;

public class P044_NthLargerDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int n = sc.nextInt();
		int temp =num;
		while (temp!=0) {
			int ld = temp%10;
			int count =0;
			int temp1 = num;
			while (temp1!=0) {
				int ld1 =temp1%10;
				if(ld1>ld)
				{
					count++;
				}
				temp1/=10;
			}
			if(count==(n-1))
			{
				System.out.println(ld);
				break;
			}
			temp/=10;
		}
		sc.close();
	}

}
