package WhileDoWhileStatements;
//import java.util.Scanner;
public class P010WhileLoopPalidromNumber1To10001 
{
	public static void main(String[] args) 
	{
		//Scanner sc = new Scanner(System.in);
		
		int sln = 1;
		for (int original = 1;original<=1000;original++)
		{
			//System.out.print("Enter a number : ");
			int reverse = 0;
			int xerox = original;
			while (xerox!=0) 
			{
				int ld=xerox%10;
				xerox/=10;
				reverse=reverse*10+ld;
			}	
			if (original==reverse)
			{
				System.out.println(sln+") "+original);
				sln++;
			}
		}
	}
}