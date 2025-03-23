package _I_Tried_Programmes;

import java.util.Scanner;

public class AutobiographicalNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int temp = n;
		int count = 0;
		int sum = 0;
		while (temp!=0)
		{
			int ld = temp%10;
			count++;
			sum+=ld;
			temp/=10;
		}
		if (count==sum)
		{
			System.out.println("Autobiographical Number");
		}
		else
		{
			System.out.println("Not a Autobiographical Number");
		}
		sc.close();
	}

}
/* count == sum
ex: 1210
count = 4
sum = 4 -> 1+2+1+0 = 4
*/