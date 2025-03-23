package ForLoopStatements;
import java.util.Scanner;
public class P005ForLoopUserName20Times 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your name : ");
		String name = sc.next();
		
		for (int a = 1;a<=20;a++)
		{
			System.out.println(a+". "+name);
		}
		sc.close();
	}
}
//3times=siva,siva,siva (vertically)