package WhileDoWhileStatements;
//import java.util.Scanner;
public class P019WhileLoopArmStrongNumbers1To10000 
{
	public static void main(String[] args) 
	{
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter a number : ");
//		int n = sc.nextInt();
		int sln = 1;
		for (int n = 1;n<=10000;n++)
			{
			int temp = n;
			int count = 0;
			while (temp!=0)
			{
				count++;
				temp/=10;
			}
			int sum = 0;
			temp = n; // re-initializing 'temp with n'
			while (temp!=0)
			{
				int ld = temp%10;
				int exponantial = 1;
				for (int i = 1;i<=count;i++)
				{
					exponantial*=ld;
				}
				sum+=exponantial;
				temp/=10;
			}
			if (sum==n)
			{
				System.out.println(sln+") "+n);
				sln++;
			}
		}
	}
}