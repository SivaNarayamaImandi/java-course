package Test_1_Practice;
import java.util.Scanner;
public class Main_006_ForLoopUserNameUserAskedTimes 
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter user name : ");
		String name = sc.next();
		System.out.println("Enter how many times : ");
		int t = sc.nextInt();
		for (int i = 1;i<=t;i++)
		{
			System.out.println(i+". "+name);
		}
	}
}