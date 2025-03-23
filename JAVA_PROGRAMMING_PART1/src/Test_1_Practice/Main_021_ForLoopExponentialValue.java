package Test_1_Practice;
import java.util.Scanner;
public class Main_021_ForLoopExponentialValue 
{
	public static void main(String[] args) 
	{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter base value : ");
			int base = sc.nextInt();
			System.out.println("Enter power value : ");
			int power = sc.nextInt();
			int product = 1;
			for (int i = 1;i<=power;i++)
			{
				product*=base;
			}
			System.out.println(product);
	}
}