package ForLoopStatements;
import java.util.Scanner;
public class P006ForLoopUserNameUserAskedNames 
{
	public static void main(String[] args) 
	{
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter your name : ");
			String name = sc.next();
			System.out.print("How many times : ");
			int times = sc.nextInt();
			
			for (int i = 1;i<=times;i++)
			{
				System.out.println(i+ ". "+name);
			}
			sc.close();
	}
}
/* user ask 2 times
siva
siva
*/