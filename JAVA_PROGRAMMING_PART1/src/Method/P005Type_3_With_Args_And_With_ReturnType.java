package Method;
import java.util.Scanner;
public class P005Type_3_With_Args_And_With_ReturnType 
{
	public static int factorsCount(int num)// replace void with returning data type
	{
		int count = 0;
		for (int i = 1;i<=num;i++)
		{
			if (num%i==0)
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
//		int isPrime = factorsCount(num);
		if (factorsCount(num)==2)
		{
			System.out.println("Prime number");
		}
		else
		{
			System.out.println("Not a Prime number");
		}
		sc.close();
	}
}