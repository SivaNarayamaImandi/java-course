package _ExamPractice;

import java.util.Scanner;

public class P005 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int n2 = sc.nextInt();
		int hcf = 0; 
		int lcm =0 ;
		for (int i = 1;(i<=n)&&(i<=n2);i++)
		{
			if((n%i==0)&&(n2%i==0))
			{
				hcf=i;
			}
		}
		System.out.println(hcf);
		for(int i = 1; true;i++)
		{
			if((n*i)%n2==0)
			{
				lcm=n*i;
				break;
			}
		}
		System.out.println(lcm);
		
	}

}
