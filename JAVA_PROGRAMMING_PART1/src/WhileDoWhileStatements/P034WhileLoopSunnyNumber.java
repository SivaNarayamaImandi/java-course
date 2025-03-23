package WhileDoWhileStatements;
import java.util.Scanner;
public class P034WhileLoopSunnyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		boolean isSunny = false;
		int i = 1;
		while (i<=n)
		{
			i++;
			if (i*i==(n+1))
			{
			isSunny = true;
			break;
			}
		}
		if (isSunny)
		{
			System.out.println("Given number "+n+" is SUNNY Number");
		}
		else
		{
			System.out.println("Given number "+n+" is NOT SUNNY Number");
		}
		sc.close();
	}
}
//24,35,80