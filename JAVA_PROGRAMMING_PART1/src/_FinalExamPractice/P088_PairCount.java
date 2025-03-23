package _FinalExamPractice;

import java.util.Scanner;

public class P088_PairCount {

	public static boolean rep(int n)
	{
		boolean isRep=false;
		int temp1=n;
		while (temp1!=0) {
			int ld1 = temp1%10;
			int temp2=temp1;
			while (temp2!=0) {
				int ld2=temp2%10;
				if(ld1==ld2)
				{
					isRep=true;
					break;
				}
				temp2/=10;
			}
			temp1/=10;
		}
		return isRep;
	}
	
	public static int pairCount(int sum,int n)
	{
		int temp1=n;
		int count=0;
		while (temp1!=0) {
			int ld1 = temp1%10;
			int temp2=temp1;
			while (temp2!=0) {
				int ld2=temp2%10;
				if((ld1+ld2)==sum)
				{
					count++;
				}
				temp2/=10;
			}
			temp1/=10;
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = sc.nextInt();
		int n = sc.nextInt();
		if(rep(n)==false)
		{
			System.out.println(pairCount(sum,n));
		}
		else
		{
			System.out.println("invalid input");
		}
		sc.close();
	}

}
