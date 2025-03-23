package AssignmentProgrammes;
import java.util.Scanner;
public class ForloopProductOfNumbersFrom1To10 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int a = sc.nextInt();
		int sum = 1;
		for (int i = 1;i<=a;i++)
		{
			sum=sum*i;
		}
		System.out.println(sum);
		sc.close();
	}
}