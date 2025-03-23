package ForLoopStatements;
import java.util.Scanner;
public class P002ForLoopTakeXAndYValuesFromUser 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 2 no 1 by 1 : ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		for(int i=x;i<=y;i++)
		{
			System.out.println(i);
		}
		sc.close();
	}
}
//1-3=1,2,3