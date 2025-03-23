package PracticeProgrammesInJava;
import java.util.Scanner;
public class SwitchStatementAreaCalculator 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("******************************");
		System.out.println("  Welcome to AREA Calculator");
		System.out.println("******************************");
		System.out.println("Enter 1 for TRIANGLE area");
		System.out.println("Enter 2 for CIRCLE area");
		System.out.println("Enter 3 for RECTANGLE area");
		System.out.println("Enter 4 for SQUARE area");
		System.out.println("Enter 5 for PARALLELOGRAM area");
		System.out.println("Enter 6 for TRAPEZIUM area");
		System.out.println("******************************");
		System.out.print("Choose your option : ");
		int option = sc.nextInt();
		
		switch (option)
		{
		case 1 : {
			System.out.print("Enter BASE value : ");
			double b = sc.nextDouble();
			System.out.println("Enter HEIGHT value : ");
			double h = sc.nextDouble();
			System.out.println("Area of TRIANGLE is : "+0.5*b*h);
		}
		break;
		case 2 : {
			System.out.print("Enter RADIUS value : ");
			double r = sc.nextDouble();
			System.out.println("Area of CIRCLE is : "+3.14*r*r);
		}
		break;
		case 3  : {
			System.out.print("Enter LENGTH value : ");
			double l = sc.nextDouble();
			System.out.println("Enter WIDTH value : ");
			double w = sc.nextDouble();
			System.out.println("Area of RECTANGLE is : "+l*w);
		}
		break;
		case 4 : {
			System.out.print("Enter SIDE value : ");
			double s = sc.nextDouble();
			System.out.println("Area of SQUARE is : "+s*s);
		}
		break;
		case 5 : {
			System.out.print("Enter BASE value : ");
			double b = sc.nextDouble();
			System.out.println("Enter HEIGHT value : ");
			double h = sc.nextDouble();
			System.out.println("Area of PARALLELOGRAM is : "+b*h);
		}
		break;
		case 6 : {
			System.out.print("Enter LENGTH OF BASE-1 value : ");
			double bone = sc.nextDouble();
			System.out.println("Enter LENGTH OF BASE-2 value : ");
			double btwo = sc.nextDouble();
			System.out.println("Enter HEIGHT value : ");
			double h = sc.nextDouble();
			double area = 0.5*(bone+btwo)*h;
			System.out.println("Area of TRAPEZIUM is : "+area);
		}
		break;
		default : System.out.println("Entered value is invalid input. please refresh & try again");
		sc.close();
		}
	}
}