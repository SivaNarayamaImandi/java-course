package AssignmentProgrammes;
import java.util.Scanner;
public class ForLoopOnlyDoubleNumbers1To100 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		for (int i = 1;i<=n;i++)
		{
			if (i%11==0)
			{
				System.out.println(i);
			}
		}
		System.out.println("Successfully printed");
		sc.close();
	}
}