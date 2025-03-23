package Patterns;

public class P010Pattern10A2Z 
{
	public static void main(String[] args) 
	{
		char x = 'A';
		for (int i = 1;i<=5;i++)
		{
			for (int j = 1;j<=5;j++)
			{
				System.out.print(" "+x+" ");
				x++;
			}
			System.out.println();
		}
	}
}