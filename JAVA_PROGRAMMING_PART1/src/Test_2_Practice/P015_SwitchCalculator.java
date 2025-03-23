package Test_2_Practice;

import java.util.Scanner;

public class P015_SwitchCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("******************");
		System.out.println("welcome to SWITCH CALCULATOR");
		System.out.println("******************");
		System.out.println("for 1 +");
		System.out.println("for 2 -");
		System.out.println("for 3 *");
		System.out.println("for 4 /");
		System.out.println("for 5 %");
		System.out.println("enter your choice");
		int n = sc.nextInt();
		switch (n)
		{
		case 1: System.out.println("enter two number 1 by 1 : ");
		double a = sc.nextInt();
		double b = sc.nextInt();
		double res = a+b;
		System.out.println(res);
		break;
		case 2: System.out.println("enter two number 1 by 1 : ");
		double c = sc.nextInt();
		double d = sc.nextInt();
		double r = c-d;
		System.out.println(r);
		break;
		case 3: System.out.println("enter two number 1 by 1 : ");
		double e = sc.nextInt();
		double f= sc.nextInt();
		double re = e*f;
		System.out.println(re);
		break;
		case 4: System.out.println("enter two number 1 by 1 : ");
		double g = sc.nextInt();
		double h = sc.nextInt();
		double resu = g/h;
		System.out.println(resu);
		break;
		case 5: System.out.println("enter two number 1 by 1 : ");
		double i = sc.nextInt();
		double j = sc.nextInt();
		double resul = i%j;
		System.out.println(resul);
		break;
		default: System.out.println("invalid choice");
		}
	}

}
