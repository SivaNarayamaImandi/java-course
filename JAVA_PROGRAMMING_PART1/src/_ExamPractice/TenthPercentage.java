package _ExamPractice;
import java.util.Scanner;
public class TenthPercentage 
{
	public static void main (String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Telugu marks : ");
		int t = sc.nextInt();
		System.out.print("English marks : ");
		int e = sc.nextInt();
		System.out.print("Science marks : ");
		int s = sc.nextInt();
		System.out.print("Social marks : ");
		int so = sc.nextInt();
		System.out.print("Maths marks : ");
		int m = sc.nextInt();
		System.out.print("Hindi marks : ");
		int h = sc.nextInt();
		double percentage = (t+e+s+so+m+h)/6.0;
		System.out.println("Tenth percentage is : "+percentage);
	}
}