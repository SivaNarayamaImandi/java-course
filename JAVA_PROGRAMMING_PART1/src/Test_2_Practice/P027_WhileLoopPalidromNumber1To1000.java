package Test_2_Practice;

//import java.util.Scanner;

public class P027_WhileLoopPalidromNumber1To1000 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		int sln = 1;
		for (int n=1;n<=10000;n++)
		{
			int temp = n;
			int rev = 0;
			while(temp!=0)
			{
				int ld = temp%10;
				rev = rev*10+ld;
				temp/=10;
			}
			if (rev==n)
			{
				System.out.println(sln+") "+n);
				sln++;
			}
		}
	}

}
