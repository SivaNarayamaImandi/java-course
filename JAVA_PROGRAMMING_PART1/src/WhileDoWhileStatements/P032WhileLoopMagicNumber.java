package WhileDoWhileStatements;
import java.util.Scanner;
public class P032WhileLoopMagicNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		int temp = n;
		while (temp>9)
		{
			int sum =0;
			while (temp!=0) 
			{
				int ld=temp%10;
				sum+=ld;
				temp/=10;
			}
			temp=sum;
		}
		if (temp==1)
		{
			System.out.println("Given number "+n+" is MAGIC Number");
		}
		else
		{
			System.out.println("Given number "+n+" is NOT MAGIC Number");
		}
		sc.close();
	}
}
// 325