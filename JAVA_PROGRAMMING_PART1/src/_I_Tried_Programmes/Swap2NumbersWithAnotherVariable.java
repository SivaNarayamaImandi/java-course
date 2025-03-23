package _I_Tried_Programmes;

import java.util.Scanner;

public class Swap2NumbersWithAnotherVariable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers 1 by 1 : ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int temp = x;
		x = y;
		y =temp;
		System.out.println(x);
		System.out.println(y);
		sc.close();
	}

}
