package WhileDoWhileStatements;
import java.util.Scanner;
public class P002WhileLoopCountingGivenNumDigits 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int count = 0;
		while (num!=0) 
		{
			//count++; //put here also
			num/=10;
			count++;
		}
		System.out.println("Total digits in given number is : "+count);
		System.out.println("Finally given number becomes : "+num);
		sc.close();
	}
}