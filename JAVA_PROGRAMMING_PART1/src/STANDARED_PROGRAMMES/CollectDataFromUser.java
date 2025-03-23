package STANDARED_PROGRAMMES;
import java.util.Scanner;

public class CollectDataFromUser 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name");
		sc.next();//String
		System.out.println("Enter you age");
		sc.nextInt();//int
		System.out.println("Enter your gender only first letter");
		sc.next().charAt(0);//char
		System.out.println("Enter your 10th Percentage");
		sc.nextDouble();//float
		sc.close();
	}

}