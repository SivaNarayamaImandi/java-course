package _ExamPractice;
import java.util.Scanner;
public class DuckNumber {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean duck = true;
		while (n!=0)
		{
			int ld = n%10;
			if (ld==0)
			{
				duck = false;
				break;
			}
			n/=10;
		}
		if (duck==false)
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
