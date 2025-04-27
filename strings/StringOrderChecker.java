package strings;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StringOrderChecker {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String");
		String input = scanner.nextLine();
		
		char[] charArray = input.toCharArray();
		Arrays.sort(charArray);
		System.out.println(new String(charArray).equals(input));

		scanner.close();
	}
}
