package _FinalExamPractice;

import java.util.Scanner;

public class P043_SunnyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		boolean isSunny = false;
		for (int i=1;i<=n;i++)
		{
			if(i*i==(n+1))
			{
				isSunny=true;
				break;
			}
		}
		if(isSunny)
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
