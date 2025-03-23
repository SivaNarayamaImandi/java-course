package PracticeProgrammesInJava;
import java.util.Scanner;
public class TenthMarksPercentage 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter TELUGU subject marks : ");
		int T = sc.nextInt();
		System.out.print("Enter ENGLISH subject marks : ");
		int E = sc.nextInt();
		System.out.print("Enter SCIENCE subject marks : ");
		int S = sc.nextInt();
		System.out.print("Enter SOCIAL subject marks : ");
		int SO = sc.nextInt();
		System.out.print("Enter MATHS subject marks : ");
		int M = sc.nextInt();
		System.out.print("Enter HINDI subject marks : ");
		int H = sc.nextInt();
		double percentage = (T+E+S+SO+M+H)/6.0;
		System.out.println("Your Tenth percentage is : "+percentage);
		sc.close();
	}

}