package Method;

import java.util.Scanner;

public class MegaPrimeNumber1 {
	public static boolean prime(int num) {
		int count = 0;
		if (num != 1) {
			for (int i = 1; i <= num; i++) {
				if (num % i == 0)
					count++;
			}
			if (count == 2)
				return true;
			else
				return false;
		} else {
			return true;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = scanner.nextInt();
		System.out.println(prime(num));
		if (prime(num)) {
			int temp = num;
			boolean isPrime = false;
			while (temp != 0) {
				int ld = temp % 10;
				System.out.println(ld);
				System.out.println(prime(ld));
				if (prime(ld)) {
					isPrime = true;
					temp /= 10;
					continue;
				} else {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.println("Mega Prime Number");
			} else {
				System.out.println("Not a mega prime number");
			}
		} else
			System.out.println("Given number is not a prime number");
		scanner.close();
	}
}
