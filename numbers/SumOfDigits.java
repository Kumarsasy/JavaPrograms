package numbers;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner scanner = new Scanner(System.in);
		int digit, num = scanner.nextInt(), sum = 0;
		
		while(num !=0) {
			digit = num % 10;
			sum = sum + digit;
			num = num / 10;
		}
		System.out.println("Sum of digits: " + sum);
		scanner.close();
	}
}

/*
num 
12345
1234
123
12
1

digit
5
4
3
2
1
*/