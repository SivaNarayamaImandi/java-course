package ForLoopStatements;
import java.util.Scanner;
public class P014ForLoopOnlyOddNumbers 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		for (int i = 1;i<=n;i++)
		{
			if (i%2==1)
			{
				System.out.println(i);
			}
		}
		sc.close();
	}
}
//1,3,5,7,