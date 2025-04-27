package strings;

import java.util.Scanner;

public class StringEndChecker {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first String");
		String s1 = scanner.next();
		System.out.println("Enter second string");
		String s2 = scanner.next();
		int count = 0;

		for (int j = s2.length() - 1, i = s1.length() - 1; j >= 0; j--, i--) {
			if (s2.charAt(j) == s1.charAt(i)) {
				count++;
			}
		}

		if (s2.length() == count) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		// inbuilt method
		if (s1.endsWith(s2)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		scanner.close();
	}
}
