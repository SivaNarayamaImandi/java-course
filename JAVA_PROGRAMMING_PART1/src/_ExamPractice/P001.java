package _ExamPractice;
import java.util.Scanner;
public class P001 {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		while(temp>9)
		{
			int sum =0;
			while(temp!=0)
			{
				sum+=temp%10;
				temp/=10;
			}
			temp=sum;
		}
		if (temp==1)
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
