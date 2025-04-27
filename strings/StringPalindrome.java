package strings;

import java.util.Scanner;

public class StringPalindrome {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String");
		String input = scanner.next();
		String output = "";
		System.out.println(input.length());

		for (int i = input.length() - 1; i >= 0; i--) {
			output += input.charAt(i);
		}
		
		if(output.equals(input)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}
		
		scanner.close();
	}
}
