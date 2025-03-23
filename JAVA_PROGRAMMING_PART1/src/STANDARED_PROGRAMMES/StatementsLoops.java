package STANDARED_PROGRAMMES;

public class StatementsLoops 
{
	public static void main(String[] args) 
	{
		/*
		 LOOPS
		 Process => CONDITION => EXECUTE => EXPRESION => CONDITION => EXECUTE => EXPRESION
		 NOTE: Process repeats until condition 'FALSE'
		 COMMENTED STATEMENTS ARE INFINITE TIMES PRINTED
		 */
		
		//1. FOR LOOP 
		//example: 1
		for (int a = 1;a<=5;a++)
		{
			System.out.println("Hello");
			System.out.println("1");
		}
		
		/*		
		//example: 2
		for (int b = 1;b<=5;b--)
		{
			System.out.println("hai");
		}
		*/
		
		//example: 3
		for (int c = 5;c>=1;c--)
		{
			System.out.println("World");
		}
		
		
		//example: 4
		for (int d = 1;d<=20;d*=3)
		{
			System.out.println("I'm");
		}
		
		/*
		//example: 5
		int e = 1;
		for(int f = 1;f<=5;e++)
		{
			System.out.println("You");
		}
		
		
		//example: 6
		for (int g = 1; ;g++)
		{
			System.out.println("me");
		}
		
		
		//example: 7
		for (int h = 1;h<=5; )
		{
			System.out.println("I");
		}
		*/
		
		//example: 8
		int i = 1;
		for ( ;i<=5;i++)
		{
			System.out.println("Love");
		}
		
		
		//example: 9
		for (int j = 1;j<=5; )
		{
			System.out.println("You");
			j++;
		}		
	}
}