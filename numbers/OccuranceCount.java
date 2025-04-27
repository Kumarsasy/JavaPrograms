package numbers;

import java.util.Scanner;

public class OccuranceCount {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner scanner = new Scanner(System.in);
		int digit, num = scanner.nextInt(), n, count = 0;
		System.out.println("Enter a number to count occurance");
		n = scanner.nextInt();

		while (num != 0) {
			digit = num % 10;
			if (digit == n)
				count++;
			num = num / 10;
		}
		System.out.println("Number of Occurances: " + count);
		occuranceCount();
		scanner.close();
	}

	public static void occuranceCount() {
		int num = 1344542, count = 0;
		char c = '4';

		String s = Integer.toString(num);

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c)
				count++;
		}
		System.out.println("No of Occurances: " + count);

	}
}
