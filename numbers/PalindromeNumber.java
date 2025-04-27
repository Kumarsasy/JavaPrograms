package numbers;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner scanner = new Scanner(System.in);
		int digit, num = scanner.nextInt(), result = 0;
		int temp = num;
		while(num !=0) {
			digit = num % 10;
			result = result * 10 + digit;
			num = num / 10;
		}
		if(result == temp) {
			System.out.println("Palindrome number");
		}else {
			System.out.println("Not a Palindrome number");
		}
		scanner.close();
	}
}
