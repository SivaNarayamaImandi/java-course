package Test_1_Practice;
import java.util.Scanner;
public class Main_009_ForLoopSumofFactors 
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr first number : ");
		int firstNumber = sc.nextInt();
		System.out.println("Enter second number : ");
		int secondNumber = sc.nextInt();
		int sum = 0;
		for (int i =firstNumber;i<=secondNumber;i++)
		{
			if (secondNumber%i==0)
			{
				sum+=i;
			}
		}
		System.out.println("Sum of Teo number is : "+sum);
	}
}