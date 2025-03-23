package _ExamPractice;
import java.util.Scanner;
public class P01 {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		int pro = n*n;
		boolean isTrue = true;
		while(temp!=0)
		{
			if ((temp%10)==(pro%10))
			{
				isTrue = false;
				break;
			}
			temp/=10;
			pro/=10;
		}
		if (isTrue==false)
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
