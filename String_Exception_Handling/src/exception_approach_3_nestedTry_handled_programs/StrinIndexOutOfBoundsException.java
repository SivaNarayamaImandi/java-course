package exception_approach_3_nestedTry_handled_programs;

import java.util.Scanner;

public class StrinIndexOutOfBoundsException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String s = sc.next();
		System.out.print("Enter which index you want : ");
		int i = sc.nextInt();
		try {
			System.out.println(s.charAt(i));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.print("Enter valid index value b/w 0 to " + (s.length() - 1) + " : ");
			i = sc.nextInt();
			try
			{
				System.out.println(s.charAt(i));
			}
			catch (StringIndexOutOfBoundsException e1) {
				System.out.print("Enter valid index value b/w 0 to " + (s.length() - 1) + " : ");
				i=sc.nextInt();
				System.out.println(s.charAt(i));
			}
		}
		sc.close();
	}
}
