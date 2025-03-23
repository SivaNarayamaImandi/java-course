package exception_approach_2_handled_programs;

import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("ENTER STRING : ");
		String s = scanner.next();
		System.out.print("ENTER INDEX VALUE : ");
		int i = scanner.nextInt();
		try {
			char j = s.charAt(i);
			System.out.println(j);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.print("GIVEN INDEX VALUE IS WRONG...");
			System.out.print("\nRE-ENTER THE INDEX VALUE FROM 0 TO "+(s.length()-1)+" : ");
			i=scanner.nextInt();
			char j = s.charAt(i);
			System.out.print("CHARACTER IS : " + j);
		}
		scanner.close();
	}
}
