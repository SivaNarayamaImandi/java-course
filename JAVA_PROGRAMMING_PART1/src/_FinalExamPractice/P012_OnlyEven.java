package _FinalExamPractice;

import java.util.Scanner;

public class P012_OnlyEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		for (int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
//			if (i%2==1)
//			{
//				System.out.println(i);
//			}
		}
		sc.close();
	}

}
