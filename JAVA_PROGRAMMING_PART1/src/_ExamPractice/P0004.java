package _ExamPractice;

import java.util.Scanner;

public class P0004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean isRep =false;
		while(n!=0)
		{
			int ld = n%10;
			n/=10;
			int temp = n;
			while(temp!=0)
			{
				int ld2 =temp%10;
				if(ld==ld2)
				{
					isRep=true;
					break;
				}
				temp/=10;
			}
			
		}
		if (isRep==true)
		{
			System.out.println(false);
		}
		else
		{
			System.out.println(true);
		}
	}

}
