package _FinalExamPractice;

import java.util.Scanner;

public class P034_XyleomPhloem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp=n;
		int sumEx=0;
		int sumMean=0;
		while(temp!=0)
		{
			int ld = temp%10;
			if(temp<10||temp==n)
			{
				sumEx+=ld;
			}
			else
			{
				sumMean+=ld;
			}
			temp/=10;
		}
		if (sumEx==sumMean) 
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
