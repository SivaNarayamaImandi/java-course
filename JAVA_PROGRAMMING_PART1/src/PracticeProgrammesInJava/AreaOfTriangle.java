package PracticeProgrammesInJava;
import java.util.Scanner;
public class AreaOfTriangle 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter base value : ");
		double b = sc.nextDouble();
		System.out.print("Enter height value : ");
		double h = sc.nextDouble();
		double area = (1/2.0)*b*h;
		System.out.println("Area of Triangle is : "+area);
		sc.close();
	}

}