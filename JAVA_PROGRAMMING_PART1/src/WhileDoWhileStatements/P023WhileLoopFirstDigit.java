package WhileDoWhileStatements;
import java.util.Scanner;
public class P023WhileLoopFirstDigit
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		int temp = n;
		while(temp>=10)
		{
			temp/=10;
		}
		
		System.out.println("First number is : "+temp);
		sc.close();
	}
}
//1345->1
/* another way

while (temp!=0)
{
	int ld = temp%10;
	if (temp<10)
	{
		System.out.println("First number is : "+temp);
	}
	temp/=10;
}
*/