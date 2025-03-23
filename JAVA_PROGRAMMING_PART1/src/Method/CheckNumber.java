package Method;

import java.util.Scanner;

public class CheckNumber {

	public static int reverseNumber(int num) {
		int rev = 0;
		int temp = num;
		while (temp != 0) {
			int ld = temp % 10;
			rev = (rev * 10) + ld;
			temp /= 10;
		}
		return rev;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = scanner.nextInt();
		System.out.println(reverseNumber(num));
		int addedNumber = num + reverseNumber(num);
		System.out.println(addedNumber);
		while (true) {
			if (addedNumber == reverseNumber(addedNumber)) {
				System.out.println("MegaPalindrom number is : " + addedNumber);
				break;
			} else {
				addedNumber = addedNumber + reverseNumber(addedNumber);
				continue;
			}
		}
		scanner.close();
	}
}
