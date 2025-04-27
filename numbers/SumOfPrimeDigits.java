package numbers;

import java.util.Scanner;

public class SumOfPrimeDigits {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner scanner = new Scanner(System.in);
		int digit, num = scanner.nextInt(), sum = 0;

		while (num != 0) {
			digit = num % 10;
			if (digit == 2 || digit == 3 || digit == 5 || digit == 7) {
				sum = sum + digit;
			}
			num = num / 10;
		}
		System.out.println("Sum of digits: " + sum);
		scanner.close();
	}
}

/*
0 - 9
2 3 5 7
*/