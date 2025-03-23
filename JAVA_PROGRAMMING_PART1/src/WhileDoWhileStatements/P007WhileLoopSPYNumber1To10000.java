package WhileDoWhileStatements;
//import java.util.Scanner;
public class P007WhileLoopSPYNumber1To10000 
{
	public static void main(String[] args) 
	{
		//Scanner sc = new Scanner(System.in);
		
		int sln = 1;
		for (int original = 1;original<=100;original++)
		{
			//System.out.print("Enter a number : ");
			int sum =0;
			int product =1;
			int xerox = original;
			while (xerox!=0) 
			{
				int ld=xerox%10;
				xerox/=10;
				product*=ld;
				sum+=ld;
			}	
			if (sum==product)
			{
				System.out.println(sln+") "+original);
				sln++;
			}
		}
	}
}