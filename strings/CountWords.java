package strings;

import java.util.Scanner;

public class CountWords {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String");
		String input = scanner.nextLine();
		int count = 0;
		
		System.out.println(input.split(" ").length); // inbuilt method

		for (int i = 0; i < input.length(); i++) {
			if (Character.isWhitespace(input.charAt(i))) {
				count++;
			}
		}

		System.out.println(count + 1);

		scanner.close();
	}
}
