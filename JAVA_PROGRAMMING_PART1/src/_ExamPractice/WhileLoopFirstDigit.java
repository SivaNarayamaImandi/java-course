package _ExamPractice;
import java.util.Scanner;
public class WhileLoopFirstDigit
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		int temp = n;
		while(temp>=10)
		{
			temp/=10;
		}
		System.out.println("First number is : "+temp);
	}
}