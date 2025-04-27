package numbers;

import java.util.Scanner;

public class ArmstrongNumberChecker {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int digit, num = scanner.nextInt();
		int temp = num, sum = 0;

		while (num != 0) {
			digit = num % 10;
			sum += digit * digit * digit;
			num = num / 10;
		}

		System.out.println(temp == sum);
		scanner.close();
	}
}

/*
 * 1, 153, 370, 371, 407, ...
 * 
 * 153 - cube of numbers = the number 1 + 125 + 27 = 153
 */
