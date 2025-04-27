package numbers;

import java.util.Scanner;

public class DigitCounter {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner scanner = new Scanner(System.in);
		int digit, num = scanner.nextInt(), count = 0;
		
		while(num !=0) {
			count ++;
			num = num / 10;
		}
		System.out.println("Number of digits is: " + count);
		scanner.close();
	}
}
