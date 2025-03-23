package Test_2_Practice;

//import java.util.Scanner;

public class P024_WhileLoopSPYNumber1To1000 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter a number : ");
		int sln =1;
		for (int n=1;n<=1000;n++)
		{
			int temp = n;
			int sum = 0;
			int pro = 1;
			while(temp!=0)
			{
				int ld = temp%10;
				sum+=ld;
				pro*=ld;
				temp/=10;
			}
			if (sum==pro)
			{
				System.out.println(sln+") "+n);
				sln++;
			}
		}
	}

}
