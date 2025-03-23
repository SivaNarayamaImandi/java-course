package PracticeProgrammesInJava;
import java.util.Scanner;
public class SimpleInterest 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter principle amount : ");
		int p = sc.nextInt();
		System.out.print("Enter time in years : ");
		int t = sc.nextInt();
		System.out.print("Enter rate of interest : ");
		int r = sc.nextInt();
		double simpleInterest = (p*t*r)/100.0;
		System.out.println("Simple interest is : "+simpleInterest);
		sc.close();
	}

}