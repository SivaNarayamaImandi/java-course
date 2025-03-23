package ForLoopStatements;
import java.util.Scanner;
public class P012ForLoopTableCalculator 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a value : ");
		int a = sc.nextInt() ;
		System.out.print("Enter how long : ");
		int l = sc.nextInt();
		for (int i=1;i<=l;i++)
		{
			System.out.println(i+". "+a+"*"+i+"="+(i*a));
		}
		sc.close();
	}
}
//2*1=2