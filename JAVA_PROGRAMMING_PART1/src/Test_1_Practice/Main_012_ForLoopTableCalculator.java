package Test_1_Practice;
import java.util.Scanner;
public class Main_012_ForLoopTableCalculator 
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number which table you want : ");
		int n = sc.nextInt();
		System.out.println("Enter how long : ");
		int l = sc.nextInt();
		for (int i = 1;i<=l;i++)
		{
			System.out.println(i+". "+n+"*"+i+"="+(i*n));
		}
	}
}