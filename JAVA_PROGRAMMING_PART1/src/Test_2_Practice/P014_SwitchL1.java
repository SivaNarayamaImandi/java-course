package Test_2_Practice;

import java.util.Scanner;

public class P014_SwitchL1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		switch(n)
		{
		case 1: System.out.println("hai");
		case 2: System.out.println("hello");
		case 3: System.out.println("im");
		case 4: System.out.println("your");
		}
		System.out.println("Enter a number : ");
		int a = sc.nextInt();
		switch(a)
		{
		case 1: System.out.println("hai");
		default: System.out.println("may");
		case 2: System.out.println("hello");
		case 3: System.out.println("im");
		case 4: System.out.println("your");
		}
		System.out.println("Enter a number : ");
		int c = sc.nextInt();
		switch(c)
		{
		case 1: System.out.println("hai");
		break;
		default: System.out.println("may");
		break;
		case 2: System.out.println("hello");
		break;
		case 3: System.out.println("im");
		break;
		case 4: System.out.println("your");
		break;
		}
	}
}
