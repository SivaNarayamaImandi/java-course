package _I_Tried_Programmes;

import java.util.Scanner;

public class SpecialNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp =n;
		int count = 0;
		while(temp!=0)
		{
			int ld = temp%10;
			count++;
			temp/=10;
		}
		if(count==2)
		{
			int temp1=n;
			int sum =0;
			int pro=1;
			while(temp1!=0)
			{
				int ld =temp1%10;
				sum+=ld;
				pro*=ld;
				temp1/=10;
			}
			int total =pro+sum;
			if(total==n)
			{
				System.out.println(true);
			}
			else
			{
				System.out.println(false);
			}
		}
		else
		{
			System.out.println("more than 2 numbers Not a Special number");
		}
	}

}
