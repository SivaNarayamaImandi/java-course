package _ExamPractice;

import java.util.Scanner;

public class P003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		int sumExt = 0;
		int sumMean = 0;
		while(temp!=0)
		{
			if(temp<10||temp==n)
			{
				sumExt+=temp%10;
			}
			else
			{
				sumMean+=temp%10;
			}
			temp/=10;
		}
		if (sumExt==sumMean)
		{
			System.out.println("Xylem");
		}
		else
		{
			System.out.println("Phloem");
		}
		sc.close();
	}

}
