package ForLoopStatements;
import java.util.Scanner;
public class P007ForLoopFactorialOfAGivenNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int num=sc.nextInt();
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
		sc.close();
	}
}
//3=1*2*3=6