package ForLoopStatements;
import java.util.Scanner;
public class P019ForLoopPrintingSlnNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter n Value : ");
		int n = sc.nextInt();
		int sln = 1;
		for (int x=1;sln<=n;x++)
		{
			int count = 0;
			for (int i = 1;i<=x;i++)
			{
				if (x%i==0)
				{
					count++;
				}
			}
			if (count==2)
			{
				if (sln==n)
				{
					System.out.println(sln+") "+x);
				}
				sln++;
			}
		}
		sc.close();
	}
}
//100= 100) 541
//sln+") "+x