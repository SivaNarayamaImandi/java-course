package _ExamPractice;
import java.util.Scanner;
public class UserDetails 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your name : ");
		String name = sc.next();
		System.out.print("Enter your age : ");
		int age = sc.nextInt();
		System.out.print("Enter first letter of your name : ");
		char firstLetter = sc.next().charAt(0);
		System.out.print("Enter your tenth percentage : ");
		double percentage = sc.nextDouble();
		System.out.print("Did you pass tenth true or false : ");
		boolean pass = sc.nextBoolean();
	}
}