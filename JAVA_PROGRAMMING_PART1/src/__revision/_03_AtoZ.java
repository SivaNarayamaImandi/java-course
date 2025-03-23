package __revision;

import java.util.Scanner;

public class _03_AtoZ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter starting alphabet : ");
		char i= sc.next().charAt(0);
		System.out.print("Enter ending alphabet : ");
		char j= sc.next().charAt(0);
		for(char a=i;a<=j;a++)
		{
			System.out.println(a);
		}
		sc.close();
	}
}
