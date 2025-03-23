package WhileDoWhileStatements;
import java.util.Scanner;
public class P020WhileLoopDuckNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		int temp = n;
		boolean duck = true;
		while (temp!=0)
		{
			int ld = temp%10;
			if (ld==0)
			{
				duck=false;
				break;
			}
			temp/=10;
		}
		if (duck==false)
		{
			System.out.println("duck number");
		}
		else
		{
			System.out.println("not a duck number");
		}
		sc.close();
	}
}
//1212303