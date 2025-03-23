package ForLoopStatements;
import java.util.Scanner;
public class P021ForLoopExponentialValue 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter base value : ");
		int b = sc.nextInt();
		System.out.print("Enter power value : ");
		int p = sc.nextInt();
		int exponantial = 1;
		for (int i = 1;i<=p;i++)
		{
			exponantial *=b;
		}
		System.out.println("Total value is : "+exponantial);
		sc.close();
	}
}