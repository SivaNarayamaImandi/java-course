package WhileDoWhileStatements;
import java.util.Scanner;
public class P036WhileLoopHCFOfAGivenNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 number 1 by 1 : ");//highest common factor
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int hcf = 0;
//		int i = 1;
//		while (i<=n1&&i<=n2)
//		{
//			if (n1%i==0&&n2%i==0)
//			{
//				System.out.println("Common factors : "+i);
//				hcf = i;
//			}
//			i++;
//		}
		for (int i = 1;(i<=n1&&i<=n2);i++)
		{
			if (n1%i==0&&n2%i==0)
				{
					System.out.println("Common factors : "+i);
					hcf = i;
				}
		}
		System.out.println("Highest common factor of given number "+n1+" and "+n2+" is : "+hcf);
		sc.close();
	}
}
//6,8->2