package Test_2_Practice;

//import java.util.Scanner;

public class P029_WhileLoopStrongNumber1To10000 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a number : ");
//		int n = sc.nextInt();
		int sln = 1;
		for (int n =1;n<=10000;n++)
		{
			int temp = n;
			int sum = 0;
			while(temp!=0)
			{
				int ld = temp%10;
				int factorial = 1;
				for (int i = 1;i<=ld;i++)
				{
					factorial*=i;
				}
				sum+=factorial;
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
