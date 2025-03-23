package WhileDoWhileStatements;
import java.util.Scanner;
public class P030WhileLoopAutoMorphicNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		int temp = n;
		int square = n*n;
		boolean isSame = true;
		while (temp!=0)
		{
			if ((temp%10)==(square%10))
			{
				isSame = false;
				break;
			}
			temp/=10;
			square/=10;
		}
		if (isSame == false)
		{
			System.out.println("Given number "+n+" is Auto Morphic number");
		}
		else
		{
			System.out.println("Given number "+n+" is Not a Auto Morphic number");
		}
		sc.close();
	}
}
//5->5*5=25->true,2->2*2=4false  -> (both end numbers)