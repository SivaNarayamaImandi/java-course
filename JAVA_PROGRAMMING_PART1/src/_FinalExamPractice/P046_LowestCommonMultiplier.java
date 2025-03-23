package _FinalExamPractice;

import java.util.Scanner;

public class P046_LowestCommonMultiplier {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 =sc.nextInt();
		int n2 = sc.nextInt();
		int lcm =0;
		for(int i=1;true;i++)
		{
			if((n1*i)%n2==0)
			{
				lcm=n1*i;
				break;
			}
		}
		System.out.println(lcm);
		sc.close();
	}

}
