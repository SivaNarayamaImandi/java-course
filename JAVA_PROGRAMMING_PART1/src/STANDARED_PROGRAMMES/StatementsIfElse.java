package STANDARED_PROGRAMMES;

public class StatementsIfElse 
{

	public static void main(String[] args) 
	{
		//1. if - else 
		// example: 1
		int a = 50;
		if (a<8)
		{
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		// example: 2
		int b = 188;
		int rem = b%2;
		if (rem==0)
		{
			System.out.println("even");
		}
		else 
		{
			System.out.println("Odd");
		}
		
		
		//2. else - if
		//example: 1
		int c = 3;
		if (c>0)
		{
			System.out.println(c+" is a positive number");
		}
		else if (c<0)
		{
			System.out.println(c+" is a negative number");
		}
		else
		{
			System.out.println(c+" is a neutral number");
		}


		//3. switch 
		//example: 1 (level - 1)
		int d = 1;
		switch (d)
		{
		case 1 : System.out.println("Case 1 printed");
		case 2 : System.out.println("Case 2 printed");
		case 3 : System.out.println("Case 3 printed");
		case 4 : System.out.println("Case 4 printed");
		case 5 : System.out.println("Case 5 printed");
		}
		
		//example: 2 (level - 2)
		int e = 5;
		switch (e)
		{
		case 1 : System.out.println("Case 1 printed");
		case 2 : System.out.println("Case 2 printed");
		case 3 : System.out.println("Case 3 printed");
		case 4 : System.out.println("Case 4 printed");
		case 5 : System.out.println("Case 5 printed");
		default : System.out.println("default case printed");
		}
	
		//example: 3 (level - 3)
		int f = 7;
		switch (f)
		{
		case 1 : System.out.println("Case 1 printed");
		break;
		case 2 : System.out.println("Case 2 printed");
		break;
		default : System.out.println("default case printed");
		break;
		case 3 : System.out.println("Case 3 printed");
		break;
		case 4 : System.out.println("Case 4 printed");
		break;
		case 5 : System.out.println("Case 5 printed");
		break;
		}
	}

}