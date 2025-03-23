package _ExamPractice;
import java.util.Scanner;
public class SumOfFourNumber 
{
		public static void main(String[]args)
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.print("First no : ");
			int a = sc.nextInt();
			System.out.print("Second no : ");
			int b = sc.nextInt();
			System.out.print("Third no : ");
			int c = sc.nextInt();
			System.out.print("Fourth no : ");
			int d = sc.nextInt();
			int res = a+b+c+d;
			System.out.println("Sum of four numbers is : "+res);
		}
}