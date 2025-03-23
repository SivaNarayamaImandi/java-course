package ForLoopStatements;

public class P017ForLoopFirst100PrimeNumbers 
{
	public static void main(String[] args) 
	{
		for (int x = 1;x<=100;x++)
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
				System.out.println(x);
			}
		}
	}
}
//2,3,5,7,11,13.....,97