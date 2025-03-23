package Test_1_Practice;
import java.util.Scanner;
public class Main_007_ForLoopSumOfNumbers1To10 
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int firstNumber = sc.nextInt();
		System.out.println("Enetr second number : ");
		int secondNumber = sc.nextInt();
		int sum = 0;
		for (int i = firstNumber;i<=secondNumber;i++)
		{
			sum+=i;
		}
		System.out.println("Sum of first number to second number is : "+sum);
	}
}