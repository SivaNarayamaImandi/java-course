package _I_Tried_Programmes;

import java.util.Scanner;

public class AnagramsNumber {

	public static boolean isCountSame(int n1,int n2)
	{
		while (n1!=0&&n2!=0) {
			n1/=10;
			n2/=10;
		}
		if(n1!=n2)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		if(isCountSame(n1,n2)==true)
		{
			boolean areAllPresent=true;
			while (n1!=0) {
				int ld1=n1%10;
				int temp2=n2;
				boolean isPresent = false;
				while (temp2!=0) 
				{
					int ld2=temp2%10;
					if(ld2==ld1)
					{
						isPresent=true;
						break;
					}
					temp2/=10;
				}
				areAllPresent=false;
				n1/=10;
			}
			if(areAllPresent==false)
			{
				System.out.println(true);
			}
			else
			{
				System.out.println(false);
			}
		}
		else
		{
			System.out.println("length is not same");
		}
		sc.close();
	}

}
