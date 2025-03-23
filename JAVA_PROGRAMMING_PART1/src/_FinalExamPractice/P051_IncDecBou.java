package _FinalExamPractice;

import java.util.Scanner;

public class P051_IncDecBou {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int cd=10;
		int temp=n;
		boolean isInc = true;
		while (temp!=0) {
			int ld =temp%10;
			if(ld<=cd)
			{
				cd=ld;
			}
			else
			{
				isInc=false;
				break;
			}
			temp/=10;
		}
		temp=n;
		cd=0;
		boolean isDec = true;
		while (temp!=0) {
			int ld1 = temp%10;
			if(ld1>=cd)
			{
				cd=ld1;
			}
			else
			{
				isDec=false;
				break;
			}
			temp/=10;
		}
		if(isInc)
		{
			System.out.println("Inc");
		}
		else if(isDec)
		{
				System.out.println("Dec");
		}
		else
		{
			System.out.println("Bou");
		}
		sc.close();
	}

}
