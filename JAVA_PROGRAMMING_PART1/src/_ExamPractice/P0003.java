package _ExamPractice;

import java.util.Scanner;

public class P0003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp1 = num;
		//System.out.println("Enter which largest digit you want? : ");
		int n = 1;
		while (temp1!=0)
		{
			int count = 0;
			int ld1 = temp1%10;
			int temp2 = num;
			while (temp2!=0)
			{
				int ld2 = temp2%10;
				if (ld2>ld1)
				{
					count++;
				}
				temp2/=10;
			}
			if (count == (n-1))
			{
				System.out.println(n+"th largest number is "+ld1);
				break;
			}
			temp1/=10;
		}
	}

}
