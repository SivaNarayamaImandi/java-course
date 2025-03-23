package WhileDoWhileStatements;
import java.util.Scanner;
public class P037WhileLoopLCMOfAGivenNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers 1 by 1 :");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int lcm = 0;
		int i = 1;
		while (true)
		{
			if ((n1*i)%n2==0)
			{
				lcm = n1*i;
				break;
			}
			i++;
		}
		System.out.println("LCM Of A Given Number is : "+lcm);
		sc.close();
	}
}
/*	12 = 2 * 2 * 3 = 2² * 3¹ -> 2²
	18 = 2 * 3 * 3 = 2¹ * 3² -> 3²
	2² * 3² = 36
*/