package PracticeProgrammesInJava;
import java.util.Scanner;
public class SumOfThreeNumbers 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number : ");
		int a = sc.nextInt();
		System.out.print("Enter second number : ");
		int b = sc.nextInt();
		System.out.print("Enter third number : ");
		int c = sc.nextInt();
		int result = a+b+c;
		System.out.println("Sum of three numbers is : "+result);
		sc.close();

	}

}