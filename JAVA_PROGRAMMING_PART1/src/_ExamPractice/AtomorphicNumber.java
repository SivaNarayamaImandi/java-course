package _ExamPractice;

import java.util.Scanner;

public class AtomorphicNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int temp = n;
		int sqe = n*n;
		boolean isAto = true;
		while(temp!=0)
		{
			if ((temp%10)==(sqe%10))
			{
				isAto = false;
				break;
			}
			temp/=10;
			sqe/=10;
		}
		if (isAto==false)
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
	}

}
