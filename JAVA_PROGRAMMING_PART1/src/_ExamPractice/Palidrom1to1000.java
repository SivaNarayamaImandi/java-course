package _ExamPractice;

//import java.util.Scanner;

public class Palidrom1to1000 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		for (int n =1 ;n<=1000;n++)
		{
			int temp = n;
			int rev = 0;
			while(temp!=0)
			{
				rev=rev*10+temp%10;
				temp/=10;
			}
			if (rev==n)
			{
				System.out.println(n);
			}
		}
//		sc.close();
	}

}
