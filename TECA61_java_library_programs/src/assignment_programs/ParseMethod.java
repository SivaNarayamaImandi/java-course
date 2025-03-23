package assignment_programs;

import java.util.Scanner;

public class ParseMethod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		String s =sc.next();
		int n = Integer.parseInt(s);
		int temp=n;
		int sum=0;
		while(temp!=0)
		{
			int ld = temp%10;
			if(ld%2==0)
			{
				sum+=ld;
			}
			temp/=10;
		}
		System.out.println(sum);
		for(int i=1;i<=10;i++)
		{
			System.out.println(sum+" * "+i+" = "+sum*i);
		}
		
		sc.close();
	}
}
