package Method;

import java.util.Scanner;

public class P009Carry {
	
	public static int carry(int n1,int n2)
	{
		int carry=0;
		if(n1<=n2)
		{
			int temp=n1;
			n1=n2;
			n2=temp;
		}
		int count=0;
		while (n1!=0) {
			int sum =  (n1%10)+(n2%10)+carry;
			if(sum>9)
			{
				carry=1;
				count++;
			}
			else
			{
				carry=0;
			}
			n1/=10;n2/=10;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt();
		int n2= sc.nextInt();
		System.out.println(carry(n1,n2));
		sc.close();
		}

}
