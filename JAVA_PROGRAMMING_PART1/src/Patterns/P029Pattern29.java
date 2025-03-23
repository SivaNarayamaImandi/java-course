package Patterns;

public class P029Pattern29 
{
	public static void main(String[] args) 
	{
		int star = 9;
		int space = 0;
		for (int i = 1;i<=9;i++)
		{
			for (int a = 1;a<=space;a++)
			{
				System.out.print("   ");
			}
			for (int b = 1;b<=star;b++)
			{
				System.out.print(" * ");
			}
			if (i<=4)
			{
				space++;star-=2;
			}
			else
			{
				space--;star+=2;
			}
			System.out.println();
		}
	}
}