package numbers;

import java.util.Scanner;

public class NivenNumberChecker {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		System.out.println(num%sum(num) == 0 ? "Niven number" : "Not Niven number");
		scanner.close();
	}
	
	public static int sum(int num) {
		int digit, sum = 0;
		
		while(num !=0) {
			digit = num % 10;
			sum = sum + digit;
			num = num / 10;
		}
		return sum;
	}
}

/*
10 12 18 20 21

number % sum of digits and remainder is 0  
*/

