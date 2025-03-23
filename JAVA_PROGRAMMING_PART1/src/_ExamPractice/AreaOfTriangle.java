package _ExamPractice;
import java.util.Scanner;
public class AreaOfTriangle 
{
		public static void main(String[]args)
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter base value : ");
			int b = sc.nextInt();
			System.out.print("Enter height value : ");
			int h = sc.nextInt();
			double area = (1/2.0)*b*h;
			System.out.println("Triangle area is : "+area);
		}
}