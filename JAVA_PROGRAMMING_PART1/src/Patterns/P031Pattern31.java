package Patterns;

public class P031Pattern31 
{
	public static void main(String[] args) 
	{
		int star = 1;
		int space = 8;
		for (int i = 1;i<=5;i++)
		{
			for (int a = 1;a<=star;a++)
			{
				System.out.print(" * ");
			}
			for (int b = 1;b<=space;b++)
			{
				System.out.print("   ");
			}
			for (int c = 1;c<=star;c++)
			{
				System.out.print(" * ");
			}
			space-=2;star++;
			System.out.println();
		}
	}
}