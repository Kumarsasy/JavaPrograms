package numbers;

import java.util.Scanner;

public class PalindromeNumber2 {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner scanner = new Scanner(System.in);
		String num = scanner.next();
		StringBuffer sb = new StringBuffer(num);
		String reversedNumber = sb.reverse().toString();
		System.out.println(reversedNumber.equals(num) ? "Palindrome Number" : "Not a Palindrom number");
		scanner.close();
	}
}
