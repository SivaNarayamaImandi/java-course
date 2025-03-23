package WhileDoWhileStatements;
import java.util.Scanner;
public class P033WhileLoopHappyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		int temp = n;
		do
		{
			int sum =0;
			while (temp!=0) 
			{
				int ld=temp%10;
				ld*=ld;
				sum+=ld;
				temp/=10;
			}
			temp=sum;
		} while (temp>9);
		if (temp==1)
		{
			System.out.println("Given number "+n+" is HAPPY Number");
		}
		else
		{
			System.out.println("Given number "+n+" is NOT HAPPY Number");
		}
		sc.close();
	}
}
//7