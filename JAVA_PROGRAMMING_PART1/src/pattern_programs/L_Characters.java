package pattern_programs;

import java.util.Scanner;

public class L_Characters {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("ENTER NO OF ROWS : ");
		int r=sc.nextInt();
		char c='A';
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(c+++" ");
			}
			c='A';
			System.out.println();
		}
		sc.close();
	}
}
