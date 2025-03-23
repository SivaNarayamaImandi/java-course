package _I_Tried_Programmes;

import java.util.Scanner;

public class Wipro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m1 = sc.nextInt();
		int p1 = sc.nextInt();
		int m2 = sc.nextInt();
		int p2 = sc.nextInt();
		int min = Integer.MAX_VALUE; 
		for (int i=0;m1*i<=n;i++)
		{
			int rem = n-(i*m1);
			int shop2 = (rem%m2>0)?(rem/m2)+1:(rem/m2);
			int totalPrice = (i*p1)+(shop2*p2);
			if(totalPrice<min)
			{
				min=totalPrice;
			}
		}
		System.out.println(min);
		sc.close();
	}

}
