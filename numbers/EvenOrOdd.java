package numbers;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		try (Scanner scanner = new Scanner(System.in)) {
			int num = scanner.nextInt();
			if (num <= 0) {
				// System.out.println("Invalid number: " + num);
				throw new IllegalArgumentException("Invalid number: " + num);
			} else {
				if (num % 2 == 0) {
					System.out.println("Even");
				} else {
					System.out.println("Odd");
				}
			}
		}
		// scanner.close(); // scanner no need to close if your'e using Scanner inside
		// try block
	}
}
