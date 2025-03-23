package _FinalExamPractice;

import java.util.Scanner;

public class P090_AnagramNumber {
	public static boolean isSame(int a,int b)
	{
		while (a!=0&&b!=0) {
			a/=10;
			b/=10;
		}
		if(a!=b)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b =sc.nextInt();
		if(isSame(a,b)==true)
		{
			boolean allArePresent=true;
			while (a!=0) {
				int ld1=a%10;
				int temp=b;
				boolean isPresent=false;
				while (temp!=0) {
					int ld2=temp%10;
					if(ld2==ld1)
					{
						isPresent=true;
						break;
					}
					temp/=10;
				}
				if(isPresent==false)
				{
					allArePresent=false;
					break;
				}
				a/=10;
			}
			if(allArePresent)
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
			System.out.println("invalid input");
		}
		sc.close();
	}

}
