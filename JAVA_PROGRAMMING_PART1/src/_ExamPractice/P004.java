package _ExamPractice;

import java.util.Scanner;

public class P004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		int cd = 10;
		boolean isInc = true;
		while(temp!=0)
		{
			int ld = temp%10;
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
		while(temp!=0)
		{
			int ld = temp%10;
			if(ld>=cd)
			{
				cd=ld;
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
			System.out.println("in");
		}
		else if(isDec)
		{
			System.out.println("de");
		}
		else
		{
			System.out.println("bo");
		}
		sc.close();
	}

}
