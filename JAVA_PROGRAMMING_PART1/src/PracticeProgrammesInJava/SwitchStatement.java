package PracticeProgrammesInJava;
import java.util.Scanner;
public class SwitchStatement 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a grade : ");
		char grade = sc.next().charAt(0);
		
		switch (grade)
		{
		case 'A':case 'a': System.out.println("Your got 1st rank");
		break;
		case 'B':case 'b': System.out.println("Your got 2nd rank");
		break;
		case 'c':case 'C': System.out.println("Your got 1st class");
		break;
		case 'D':case 'd': System.out.println("Your got 2nd class");
		break;
		case 'e':case 'E': System.out.println("Your just passed");
		break;
		case 'f':case'F': System.out.println("Your failled");
		break;
		default : System.out.println("Entered grade is invalid input. please refresh & try again");
		sc.close();
		}
	}
}