package Test_2_Practice;

import java.util.Scanner;

public class P020_WhileLoopProductOfDigitsNum1By1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number : ");
		int n = sc.nextInt();
		int temp = n;
		int pro = 1;
		while(temp!=0)
		{
			int ld = temp%10;
			pro*=ld;
			temp/=10;
		}
		System.out.println(pro);
	}

}
