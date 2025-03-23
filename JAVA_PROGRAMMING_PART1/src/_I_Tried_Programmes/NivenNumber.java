package _I_Tried_Programmes;

import java.util.Scanner;

public class NivenNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp =n;
		int sum = 0;
		while(temp!=0)
		{
			int ld = temp%10;
			sum++;
			temp/=10;
		}
		boolean istrue=true;
		
		if(n%sum==0)
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
	}

}
