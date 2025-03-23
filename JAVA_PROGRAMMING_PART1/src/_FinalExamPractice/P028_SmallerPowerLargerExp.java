package _FinalExamPractice;

import java.util.Scanner;

public class P028_SmallerPowerLargerExp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp =n;
		int lar=temp%10;
		int sma = temp%10;
		while (temp!=0) {
			if(temp%10>lar)
			{
				lar=temp%10;
			}
			if(temp%10<sma)
			{
				sma=temp%10;
			}
			temp/=10;
		}
		int exp=1;
		for(int i=1;i<=lar;i++)
		{
			exp*=sma;
		}
		System.out.println(exp);
		sc.close();
	}

}
