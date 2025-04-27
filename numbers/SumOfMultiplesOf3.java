package numbers;

import java.util.Scanner;

public class SumOfMultiplesOf3 {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner scanner = new Scanner(System.in);
		int digit, num = scanner.nextInt(), sum = 0;

		while (num != 0) {
			digit = num % 10;
			if (digit == 3 || digit == 6 || digit == 9) {
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
3 6 9
*/