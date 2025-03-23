package Patterns;

import java.util.Scanner;

public class P027Pattern27 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int space = sc.nextInt();
		int star = sc.nextInt();
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
				space--;star++;
			}
			else
			{
				space++;star--;
			}
			System.out.println();
		}
		sc.close();
	}
}